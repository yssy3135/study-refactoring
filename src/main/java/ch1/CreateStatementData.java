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

    public int amountFor(Performance aPerformance, Play play) {
       return new PerformanceCalculator(aPerformance, play).getAmount();
    }

}
