package ch12.replacesubclasswithdelegate.ex2;

@Deprecated
public class AfricanSwallow extends Bird {

    public AfricanSwallow(Data data) {
        super(data);
    }

    @Override
    public Integer getAirSpeedVelocity() {
        return null;
    }
}
