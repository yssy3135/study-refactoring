package ch10.replaceconditionalwithpolymorphism;

public class Bird {
    public String type;
    public String name;
    public int numberOfCoconuts;
    public int voltage;
    public boolean isNailed;

    public Bird(Bird bird) {
        this.type = bird.type;
        this.name = bird.name;
        this.numberOfCoconuts = bird.numberOfCoconuts;
        this.voltage = bird.voltage;
        this.isNailed = bird.isNailed;
    }

    public String plumage() {
        return "알 수 없다";
    }

    public Integer airSpeedVelocity() {
        return 0;
    }

    public static Bird createBird(Bird bird) {
        return switch (bird.type) {
            case "유럽 제비" -> new EuropeanSwallow(bird);
            case "아프리카 제비" -> new AfricanSwallow(bird);
            case "노르웨이 파랑 앵무" -> new NorwegianBlueParrot(bird);
            default -> null;
        };
    }
}
