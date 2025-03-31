package ch12.replacetypecodewithsubclasses;

import java.util.List;

public class Employee {

    String name;

    public Employee(String name, String type) {

        this.name = name;
    }


    public String toString() {
        return "name: %s, type: %s".formatted(this.name);
    }

}
