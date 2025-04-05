package ch12.replacesubclasswithdelegate.ex2;

public class NorwegianBlueParrot extends Bird {

    private boolean isNailed;

    public NorwegianBlueParrot(Data data) {
        super(data);
        this.isNailed = false;
    }

    @Override
    public String getPlumage() {
        if(this.voltage > 100) return  "그을렷다";
        else return "예쁘다";
    }

    @Override
    public Integer getAirSpeedVelocity() {
        return this.isNailed ? 0 : 10 + this.voltage/10;
    }
}
