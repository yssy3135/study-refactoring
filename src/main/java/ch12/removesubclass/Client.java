package ch12.removesubclass;

import java.util.List;

public class Client {


    public void call(List<Person> people) {
        long numberOfMales = people.stream().filter(p -> p instanceof Male).count();
    }
}
