package ch1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class Example {

    public static String statement(Invoice invoice, Map<String, Play> plays) {
        int totalAmount = 0;
        int volumeCredits = 0;

        StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명 : %s)\n", invoice.getCustomer()));

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance( Locale.US);


        for(Performance perf : invoice.getPerformances()) {
            Play play = plays.get(perf.getPlayID());
            int thisAmount = amountFor(perf, play);
            // 포인트를 적립한다.
            volumeCredits += Math.max(perf.getAudience() - 30, 0);
            // 희극 관객 5명마다 추가 포인트를 제공한다.
            if("comedy".equals(play.getType())) volumeCredits += (int) Math.floor((double) perf.getAudience() / 5);

            //청구 내역을 출력한다.
            result.append(String.format(" %s : %d (%d석)\n", play.getName(), thisAmount / 100, perf.getAudience()));
            totalAmount += thisAmount;

        }

        result.append(String.format("총액: %s\n", currencyFormatter.format(totalAmount / 100)));
        result.append(String.format("적립 포인트: %d점\n", volumeCredits));

        return result.toString();
    }

    // 함수 쪼개기
    public static int amountFor(Performance aPerformance, Play play) {
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
