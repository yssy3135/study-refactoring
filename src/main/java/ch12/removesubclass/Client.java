package ch12.removesubclass;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public void call(List<Person> people) {
        long numberOfMales = people.stream().filter(this::isMale).count();
    }

    private boolean isMale(Person p) {
        return p instanceof Male;
    }

    public List<Person> loadFromInput(List<Person> data) {
        return data.stream().map(Client::createPerson).toList();
    }

    private static Person createPerson(Person aRecord) {
        return switch (aRecord.getGenderCode()) {
            case "M" -> new Person(aRecord.getName(), "M");
            case "F" -> new Person(aRecord.getName(), "F");
            default -> new Person(aRecord.getName(), "X");
        };
    }
}
