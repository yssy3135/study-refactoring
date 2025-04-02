package ch12.replacetypecodewithsubclasses.ex1;

public class Employee {

    String name;

    public Employee(String name) {

        this.name = name;
    }


    public String toString() {
        return "name: %s, type: %s".formatted(this.name);
    }

}
