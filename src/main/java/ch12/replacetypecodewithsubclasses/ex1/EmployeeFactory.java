package ch12.replacetypecodewithsubclasses.ex1;

public class EmployeeFactory {
    public static Employee createEmployee(String name, String type) {
        switch (type) {
            case "engineer":
                return new Engineer(name);
            case "manager":
                return new Manager(name);
            case "salesperson":
                return new Salesperson(name);
            default:
                throw new IllegalArgumentException("%s 라는 직원 유형은 없습니다.".formatted(type));
        }
    }
}
