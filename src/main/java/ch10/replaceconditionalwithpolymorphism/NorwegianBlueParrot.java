package ch10.replaceconditionalwithpolymorphism;

public class NorwegianBlueParrot extends Bird {
    public NorwegianBlueParrot(Bird bird) {
        super(bird);
    }

    public String plumage() {
        return (this.voltage > 100 )? "그을렸다" : "예쁘다";
    }
}
