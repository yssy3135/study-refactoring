package ch12.removesubclass;

public class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGenderCode() {
        return "X";
    }

    public static Person createPerson(String name) {
        return new Person(name);
    }
}
