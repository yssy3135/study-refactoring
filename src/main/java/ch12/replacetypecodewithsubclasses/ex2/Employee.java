package ch12.replacetypecodewithsubclasses.ex2;

import java.util.List;

public class Employee {

    private String name;
    private String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void validateType(String arg) {
        if(List.of("engineer", "manager", "salesman").contains(arg)) {
            this.type = arg;
        } else {
            throw new IllegalArgumentException(String.format("%s라는 직원 유형은 없습니다.", arg));
        }
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String capitalizedType() {
        return this.type.substring(0, 1).toUpperCase() + this.type.substring(1).toLowerCase();
    }

    public String toString() {
        return String.format("%s, (%s)", this.name, this.capitalizedType());
    }

}
