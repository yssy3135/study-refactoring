package ch12.replacetypecodewithsubclasses;

import java.util.List;

public class Employee {

    String name;
    String type;

    public Employee(String name, String type) {
        this.validateType(type);
        this.name = name;
        this.type = type;
    }

    private void validateType(String type) {

        if(!List.of("salesperson", "engineer", "manager").contains(type)) {
            throw new IllegalArgumentException("%s 라는 직원 유형은 없습니다.".formatted(type));
        };
    }

    public String toString() {
        return "name: %s, type: %s".formatted(this.name, this.type);
    }
}
