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
        var calculator = createPerformanceCalculator(aPerformance, playFor(aPerformance));

        Performance result = new EnrichPerformance(
                aPerformance,
                calculator.getVolumeCredits(),
                playFor(aPerformance),
                calculator.amount()
        );

        return result;
    }

    private PerformanceCalculator createPerformanceCalculator(Performance aPerformance, Play aplay) {
        switch (aplay.type) {
            case "tragedy":
                return new TragedyCalculator(aPerformance, aplay);
            case "comedy":
                return new PerformanceCalculator(aPerformance, aplay);
            default:
                throw new IllegalArgumentException("알 수 없는 장르: " + aplay.type);
        }
    }


    private Play playFor(Performance aPerformance) {
        return plays.get(aPerformance.getPlayID());
    }

}
