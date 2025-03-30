package ch11.removesettingmethod;

public class Person {

    private String name;
    private String id;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
