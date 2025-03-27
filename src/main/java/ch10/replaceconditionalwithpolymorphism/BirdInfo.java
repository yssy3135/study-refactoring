package ch10.replaceconditionalwithpolymorphism;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BirdInfo {

    public Map<String, String> plumages(List<Bird> birds) {
        return birds.stream().collect(Collectors.toMap(b -> b.name, this::plumage));
    }

    public String plumage(Bird bird) {
        switch (bird.type) {
            case "유럽 제비":
                return "보통이다";
            case "아프리카 제비":
                return bird.numberOfCoconuts > 2 ? "지쳤다" : "보통이다";
            case "노르웨이 파랑 앵무":
                return bird.voltage > 100 ? "그을렸다" : "예쁘다";
            default:
                return "알 수 없다";
        }
    }

    public Integer airSpeedVelocity(Bird bird) {
        return switch (bird.type) {
            case "유럽 제비" -> 35;
            case "아프리카 제비" -> 40 - 2 * bird.numberOfCoconuts;
            case "노르웨이 파랑 앵무" -> (bird.isNailed) ? 0 : 10 + bird.voltage / 10;
            default -> null;
        };
    }
}
