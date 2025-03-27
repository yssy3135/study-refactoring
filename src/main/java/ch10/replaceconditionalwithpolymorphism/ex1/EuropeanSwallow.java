package ch10.replaceconditionalwithpolymorphism.ex1;

public class EuropeanSwallow extends Bird {
    public EuropeanSwallow(Bird bird) {
        super(bird);
    }

    public String plumage() {
        return "보통이다";
    }

    public Integer airSpeedVelocity() {
        return 35;
    }
}
