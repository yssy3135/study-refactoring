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
        return switch (type) {
            case "유럽 제비" -> "보통이다";
            case "아프리카 제비" -> numberOfCoconuts > 2 ? "지쳤다" : "보통이다";
            case "노르웨이 파랑 앵무" -> voltage > 100 ? "그을렸다" : "예쁘다";
            default -> "알 수 없다";
        };
    }

    public Integer airSpeedVelocity() {
        return switch (type) {
            case "유럽 제비" -> 35;
            case "아프리카 제비" -> 40 - 2 * numberOfCoconuts;
            case "노르웨이 파랑 앵무" -> (isNailed) ? 0 : 10 + voltage / 10;
            default -> null;
        };
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
