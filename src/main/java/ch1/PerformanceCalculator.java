package ch1;

public class PerformanceCalculator {

    protected final Performance performance;
    protected final Play play;

    public PerformanceCalculator(Performance aPerformance, Play aplay) {
        this.performance = aPerformance;
        this.play = aplay;
    }

    public int amount() {
        int result = 0;

        switch(play.type) {
            case "tragedy" :
                throw new IllegalArgumentException("오류 발생");
            case "comedy" :
                break;
            default:
                throw new IllegalArgumentException("알 수 없는 장르 : " + play.getType());
        }

        return result;
    }

    public int getVolumeCredits() {
        int result = 0;
        result += Math.max(performance.getAudience() - 30, 0);
        if("comedy".equals(play.getType())) {
            result += (int) Math.floor((double) performance.getAudience() / 5);
        }

        return result;
    }
}
