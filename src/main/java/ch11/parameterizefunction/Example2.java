package ch11.parameterizefunction;

public class Example2 {


    public Double baseCharge(Integer usage) {
        if(usage < 0) return usd(0.0);

        Double amount = withinBand(usage, 0, 100) * 0.03
                + withinBand(usage, 100, 200) * 0.05
                + withinBand(usage, 200, Integer.MAX_VALUE) * 0.07;

        return usd(amount);
    }

    private Double usd(Double amount) {
        return amount;
    }

    private Double withinBand(Integer usage, Integer bottom, Integer top) {
        return (double) (usage > bottom ? Math.min(usage, top) - bottom : 0);
    }
}
