package ch1;

public class TragedyCalculator extends PerformanceCalculator {

    public TragedyCalculator(Performance aPerformance, Play aplay) {
        super(aPerformance, aplay);
    }

    public int amount() {
        int result = 40000;
        if(this.performance.getAudience() > 30) {
            result += 1000 * (this.performance.getAudience() - 30);
        }
        return result;
    }
}
