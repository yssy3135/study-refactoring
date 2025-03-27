package ch10.replaceconditionalwithpolymorphism.ex1;

public class NorwegianBlueParrot extends Bird {
    public NorwegianBlueParrot(Bird bird) {
        super(bird);
    }

    public String plumage() {
        return (this.voltage > 100 )? "그을렸다" : "예쁘다";
    }

    public Integer airSpeedVelocity() {
        return (this.isNailed) ? 0 : 10 + this.voltage / 10;
    }
}
