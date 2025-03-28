package ch10.replacecontrolflagwithbreak;

import java.util.List;

public class Example {

    public void checkForMiscreant(List<String> people ) {

        people.stream()
                .filter(p -> p.equals("조커") || p.equals("사루만"))
                .findAny()
                .ifPresent(s -> sendAlert());
    }

    private void sendAlert() {

    }
}
