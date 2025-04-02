package ch12.replacetypecodewithsubclasses.ex2;

import java.util.List;

public class Employee {

    private String name;
    private EmployeeType type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = new EmployeeType(type);
    }

    public void validateType(String arg) {
        if(!List.of("engineer", "manager", "salesman").contains(arg)) {
            throw new IllegalArgumentException(String.format("%s라는 직원 유형은 없습니다.", arg));
        }
    }

    public EmployeeType getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = createEmployeeType(type);
    }


    public String toString() {
        return String.format("%s, (%s)", this.name, this.type.capitalizedType());
    }

    public String getTypeString() {
        return this.type.toString();
    }

    public static EmployeeType createEmployeeType(String aString) {
        return switch (aString) {
            case "engineer" -> new Engineer();
            case "manager" -> new Manager();
            case "salesman" -> new Salesperson();
            default -> throw new IllegalArgumentException(String.format("%s라는 직원 유형은 없습니다.", aString));
        };
    }

}
