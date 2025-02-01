package ch1;

public class PerformanceCalculator {

    protected final Performance performance;
    protected final Play play;

    public PerformanceCalculator(Performance aPerformance, Play aplay) {
        this.performance = aPerformance;
        this.play = aplay;
    }

    public int amount() {
        throw new IllegalArgumentException("서브클래스에서 처리하도록 설계되었습니다.");
    }

    public int getVolumeCredits() {
        int result = 0;
        result += Math.max(performance.getAudience() - 30, 0);
        return result;
    }
}
