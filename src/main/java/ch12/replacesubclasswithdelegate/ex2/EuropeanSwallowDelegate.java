package ch12.replacesubclasswithdelegate.ex2;

public class EuropeanSwallowDelegate extends SpeciesDelegate {


    public EuropeanSwallowDelegate(Data data, Bird bird) {
        super(data, bird);
    }


    public Integer getAirSpeedVelocity() {
        return 35;
    }

}
