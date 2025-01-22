package ch1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class Example {

    public String statement(Invoice invoice, Map<String, Play> plays) {
        int totalAmount = 0;


        StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명 : %s)\n", invoice.getCustomer()));


        for(Performance perf : invoice.getPerformances()) {
            //청구 내역을 출력한다.
            result.append(String.format(" %s : %d (%d석)\n", playFor(plays, perf).getName(), amountFor(perf, playFor(plays, perf)) / 100, perf.getAudience()));
            totalAmount += amountFor(perf, playFor(plays, perf));
        }

        int volumeCredits = 0;
        for (Performance perf : invoice.getPerformances()) {
            volumeCredits += volumeCreditsFor(plays, perf);
        }

        result.append(String.format("총액: %s\n", usd(totalAmount)));
        result.append(String.format("적립 포인트: %d점\n", volumeCredits));



        return result.toString();
    }

    private static String usd(int aNumber) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(aNumber / 100);
    }

    private int volumeCreditsFor(Map<String, Play> plays, Performance aPerformance) {
        int volumeCredits = 0;
        volumeCredits += Math.max(aPerformance.getAudience() - 30, 0);
        if("comedy".equals(playFor(plays, aPerformance).getType())) {
            volumeCredits += (int) Math.floor((double) aPerformance.getAudience() / 5);
        }
        return volumeCredits;
    }

    private Play playFor(Map<String, Play> plays, Performance perf) {
        return plays.get(perf.getPlayID());
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
