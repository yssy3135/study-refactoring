package ch12.replacesubclasswithdelegate.ex2;

public class AfricanSwallowDelegate extends Bird {
    private final int numberOfCoconuts;
    public AfricanSwallowDelegate(Data data) {
        super(data);
        this.numberOfCoconuts = data.numberOfCoconuts();
    }

    @Override
    public Integer getAirSpeedVelocity() {
        return 40 - 2 * this.data.numberOfCoconuts();
    }
}
