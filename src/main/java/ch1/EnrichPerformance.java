package ch1;

import java.util.Map;

public class EnrichPerformance extends Performance {


    public EnrichPerformance(Performance performance) {
        super(performance.getPlayID(), performance.getAudience());
    }

    public EnrichPerformance(Performance performance, Play play, int amount, int volumeCredits) {
        super(performance, volumeCredits, play, amount);
    }
}



