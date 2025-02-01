package ch1;

public class PerformanceCalculator {

    private final Performance performance;
    private final Play play;

    public PerformanceCalculator(Performance aPerformance, Play aplay) {
        this.performance = aPerformance;
        this.play = aplay;
    }


    // 함수 쪼개기
    public int getAmount() {
        int result = 0;

        switch(play.type) {
            case "tragedy" :
                result = 40000;
                if(this.performance.getAudience() > 30) {
                    result += 1000 * (this.performance.getAudience() -30);
                }
                break;
            case "comedy" :
                result = 30000;
                if (this.performance.getAudience() > 20) {
                    result += 10000 + 500 * (this.performance.getAudience() - 20);
                }
                result += 300 * this.performance.getAudience();
                break;
            default:
                throw new IllegalArgumentException("알 수 없는 장르 : " + play.getType());
        }

        return result;
    }
}
