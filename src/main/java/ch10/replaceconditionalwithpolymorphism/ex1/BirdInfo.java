package ch10.replaceconditionalwithpolymorphism.ex1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BirdInfo {

    public Map<String, String> plumages(List<Bird> birds) {
        return birds.stream()
                .map(Bird::createBird)
                .collect(Collectors.toMap(b -> b.name, this::plumage));
    }

    public String plumage(Bird bird) {
        return Bird.createBird(bird).plumage();
    }

    public Integer airSpeedVelocity(Bird bird) {
        return Bird.createBird(bird).airSpeedVelocity();
    }
}
