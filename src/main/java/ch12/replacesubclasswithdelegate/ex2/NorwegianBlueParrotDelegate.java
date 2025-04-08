package ch12.replacesubclasswithdelegate.ex2;

public class NorwegianBlueParrotDelegate extends SpeciesDelegate {

    private final boolean isNailed;
    private final Bird bird;

    public NorwegianBlueParrotDelegate(Data data, Bird bird) {
        super(data, bird);
        this.isNailed = data.isNailed;
        this.bird = bird;
    }


    @Override
    public Integer getAirSpeedVelocity() {
        return this.isNailed ? 0 : 10 + this.data.voltage/10;
    }


    @Override
    public String getPlumage() {
        if(this.data.voltage > 100) return "그을렸다";
        else return this.bird.getPlumage();
    }


}
