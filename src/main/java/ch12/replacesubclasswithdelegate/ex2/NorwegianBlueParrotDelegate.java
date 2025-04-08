package ch12.replacesubclasswithdelegate.ex2;

public class NorwegianBlueParrotDelegate extends Bird {

    private final boolean isNailed;
    public NorwegianBlueParrotDelegate(Data data) {
        super(data);
        this.isNailed = data.isNailed;
    }


    @Override
    public Integer getAirSpeedVelocity() {
        return this.isNailed ? 0 : 10 + this.voltage/10;
    }
}
