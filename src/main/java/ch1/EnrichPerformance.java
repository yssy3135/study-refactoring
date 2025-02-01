package ch1;

import java.util.Map;

public class EnrichPerformance extends Performance {


    public EnrichPerformance(Performance performance) {
        super(performance.getPlayID(), performance.getAudience());
    }

    public EnrichPerformance(Performance performance, int volumeCredits, Play play, int amount) {
        super(performance, volumeCredits, play, amount);
    }
}



