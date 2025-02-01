package ch1;

import java.util.Map;

public class Performance {

    private String playID;
    private int audience;


    private int volumeCredits;
    private Play play;
    private int amount;


    public Performance() {
    }

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    protected Performance(Performance performance, int volumeCredits, Play play, int amount) {
        this.playID = performance.getPlayID();
        this.audience = performance.getAudience();
        this.volumeCredits = volumeCredits;
        this.play = play;
        this.amount = amount;
    }

    public Play playFor(Map<String, Play> plays, Performance aPerformance) {
        return plays.get(aPerformance.getPlayID());
    }


    public String getPlayID() {
        return playID;
    }

    public int getAudience() {
        return audience;
    }



    public void setPlay(Play play) {
        this.play = play;
    }

    public Play getPlay() {
        return play;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getVolumeCredits() {
        return volumeCredits;
    }

    public void setVolumeCredits(int volumeCredits) {
        this.volumeCredits = volumeCredits;
    }
}



