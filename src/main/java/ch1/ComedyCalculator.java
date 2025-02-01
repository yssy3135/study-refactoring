package ch1;

public class ComedyCalculator extends PerformanceCalculator {

    public ComedyCalculator(Performance aPerformance, Play aplay) {
        super(aPerformance, aplay);
    }

    public int amount() {
        int result = 30000;
        if (this.performance.getAudience() > 20) {
            result += 10000 + 500 * (this.performance.getAudience() - 20);
        }
        result += 300 * this.performance.getAudience();

        return result;
    }
}
