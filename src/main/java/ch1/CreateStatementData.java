package ch1;

import java.util.Map;
import java.util.stream.Collectors;

public class CreateStatementData {

    private Map<String, Play> plays;
    private Invoice invoice;


    public CreateStatementData(Invoice invoice, Map<String, Play> plays) {
        this.plays = plays;
        this.invoice = invoice;
    }

    public StatementData createStatementData() {
        StatementData statementData =
                new StatementData(
                        invoice,
                        invoice.getPerformances().stream()
                                .map(this::enrichPerformance)
                                .collect(Collectors.toList())
                );

        return statementData;
    }

    public static StatementData createStatementData(Invoice invoice, Map<String, Play> plays) {

        return new CreateStatementData(invoice, plays).createStatementData();
    }


    public Performance enrichPerformance(Performance aPerformance) {
        var calculator = new PerformanceCalculator(aPerformance, playFor(aPerformance));

        Performance result = new EnrichPerformance(
                aPerformance,
                volumeCreditsFor(aPerformance),
                playFor(aPerformance),
                amountFor(aPerformance, playFor(aPerformance)) / 100
        );

        return result;
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
