package ch1;

public class Performance {

    private String playID;
    private int audience;
    private Play play;

    public Performance() {
    }

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
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

}



