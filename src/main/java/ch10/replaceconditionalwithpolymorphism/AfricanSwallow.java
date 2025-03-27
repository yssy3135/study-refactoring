package ch10.replaceconditionalwithpolymorphism;

public class AfricanSwallow extends Bird {
    public AfricanSwallow(Bird bird) {
        super(bird);
    }

    public String plumage() {
        return this.numberOfCoconuts > 2 ? "지쳤다" : "보통이다";
    }

    public Integer airSpeedVelocity() {
        return 40 - 2 * this.numberOfCoconuts;
    }
}
