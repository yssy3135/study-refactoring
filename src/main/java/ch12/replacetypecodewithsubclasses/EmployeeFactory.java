package ch12.replacetypecodewithsubclasses;

public class EmployeeFactory {
    public static Employee createEmployee(String name, String type) {
        switch (type) {
            case "engineer":
                return new Engineer(name, type);
            case "manager":
                return new Manager(name, type);
            case "salesperson":
                return new Salesperson(name, type);
            default:
                throw new IllegalArgumentException("%s 라는 직원 유형은 없습니다.".formatted(type));
        }
    }
}
