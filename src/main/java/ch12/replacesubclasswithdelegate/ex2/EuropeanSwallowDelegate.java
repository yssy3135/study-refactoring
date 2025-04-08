package ch12.replacesubclasswithdelegate.ex2;

public class EuropeanSwallowDelegate extends Bird {


    public EuropeanSwallowDelegate(Data data) {
        super(data);
    }

    @Override
    public Integer getAirSpeedVelocity() {
        return 35;
    }

}
