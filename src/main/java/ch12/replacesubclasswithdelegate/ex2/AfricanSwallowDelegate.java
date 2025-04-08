package ch12.replacesubclasswithdelegate.ex2;

public class AfricanSwallowDelegate extends SpeciesDelegate {
    private final int numberOfCoconuts;
    public AfricanSwallowDelegate(Data data, Bird bird) {
        super(data, bird);
        this.numberOfCoconuts = data.numberOfCoconuts();
    }


    @Override
    public Integer getAirSpeedVelocity() {
        return 40 - 2 * data.numberOfCoconuts();
    }
}
