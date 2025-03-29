package ch11.parameterizefunction;

public class Example2 {


    public Double baseCharge(Integer usage) {
        if(usage < 0) return usd(0.0);

        Double amount = bottomBand(usage) * 0.03
                + middleBand(usage) * 0.05
                + topBand(usage) * 0.07;

        return usd(amount);
    }

    private Double bottomBand(Integer usage) {
        return (double) Math.min(usage, 100);
    }

    private Double middleBand(Integer usage) {
        return (double) (usage > 100 ? Math.min(usage, 200) - 100 : 0);
    }

    private Double topBand(Integer usage) {
        return (double) (usage > 200 ? usage - 200 : 0);
    }

    private Double usd(Double amount) {
        return amount;
    }
}
