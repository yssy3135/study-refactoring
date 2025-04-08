package ch12.replacesubclasswithdelegate.ex2;

import java.util.Optional;

public abstract class SpeciesDelegate {
    protected final Data data;
    protected final Bird bird;

    public SpeciesDelegate(Data data, Bird bird) {
        this.data = data;
        this.bird = bird;
    }

    public String getPlumage() {
        return Optional.ofNullable(this.bird.getPlumage()).orElse("보통이다");
    }

    public Integer getAirSpeedVelocity() {
        return null;
    }
}
