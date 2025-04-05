package ch12.replacesubclasswithdelegate.ex2;

public class AfricanSwallow extends Bird{

    public AfricanSwallow(Data data) {
        super(data);
    }

    @Override
    public Integer getAirSpeedVelocity() {
        return 40 - 2 * this.data.numberOfCoconuts();
    }
}
