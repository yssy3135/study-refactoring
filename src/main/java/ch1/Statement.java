package ch1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Statement {

    private Invoice invoice;

    private Map<String, Play> plays;

    public String statement(Invoice invoice, Map<String, Play> plays) {
        this.invoice = invoice;
        this.plays = plays;
        StatementData statementData =
                new StatementData(
                        invoice,
                        invoice.getPerformances().stream()
                                .map(this::enrichPerformance)
                                .collect(Collectors.toList())
                );
        return renderPlainText(statementData);
    }

    public Performance enrichPerformance(Performance aPerformance) {
        Performance result = new EnrichPerformance(
                aPerformance,
                playFor(aPerformance),
                amountFor(aPerformance, playFor(aPerformance)),
                volumeCreditsFor(aPerformance)
                );

        return result;
    }

    private String renderPlainText(StatementData data) {
        StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명 : %s)\n", data.getCustomer()));

        for(Performance perf : data.getPerformances()) {
            result.append(String.format(" %s : %d (%d석)\n", perf.getPlay().getName(), amountFor(perf, playFor(perf)) / 100, perf.getAudience()));
        }

        result.append(String.format("총액: %s\n", usd(totalAmount(data))));
        result.append(String.format("적립 포인트: %d점\n", totalVolumeCredits(data)));

        return result.toString();
    }

    private int totalAmount(StatementData data) {

        return data.getPerformances().stream().reduce(0, (total, p) -> total + p.getAmount(), Integer::sum);
    }

    private int totalVolumeCredits(StatementData data) {
        return data.getPerformances().stream().reduce(0, (total, p) -> total + p.getVolumeCredits(), Integer::sum);
    }

    private static String usd(int aNumber) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(aNumber / 100);
    }

    private int volumeCreditsFor(Performance aPerformance) {
        int result = 0;
        result += Math.max(aPerformance.getAudience() - 30, 0);
        if("comedy".equals(playFor(aPerformance).getType())) {
            result += (int) Math.floor((double) aPerformance.getAudience() / 5);
        }
        return result;
    }

    private Play playFor(Performance aPerformance) {
        return plays.get(aPerformance.getPlayID());
    }


    // 함수 쪼개기
    private int amountFor(Performance aPerformance, Play play) {
        int result = 0;

        switch(play.type) {
            case "tragedy" :
                result = 40000;
                if(aPerformance.getAudience() > 30) {
                    result += 1000 * (aPerformance.getAudience() -30);
                }
                break;
            case "comedy" :
                result = 30000;
                if (aPerformance.getAudience() > 20) {
                    result += 10000 + 500 * (aPerformance.getAudience() - 20);
                }
                result += 300 * aPerformance.getAudience();
                break;
            default:
                throw new IllegalArgumentException("알 수 없는 장르 : " + play.getType());
        }

        return result;
    }


}
