package ch12.replacesubclasswithdelegate.ex2;

@Deprecated
public class EuropeanSwallow extends Bird {

    public EuropeanSwallow(Data data) {
        super(data);
    }

    @Override
    public Integer getAirSpeedVelocity() {
        return this.speciesDelegate.getAirSpeedVelocity();
    }

}
