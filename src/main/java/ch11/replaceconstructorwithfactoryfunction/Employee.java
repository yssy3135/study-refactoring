package ch11.replaceconstructorwithfactoryfunction;

public class Employee {

    enum EmployeeType {
        ENGINEER("E"),
        SALESMAN("S"),
        MANAGER("M");

        private String typeCode;

        EmployeeType(String typeCode) {
            this.typeCode = typeCode;
        }

    }

    private String name;

    private String typeCode;

    private Employee(String name, String typeCode) {
        this.name = name;
        this.typeCode = typeCode;
    }

    public String getName() {
        return name;
    }

    public EmployeeType getType() {
        return EmployeeType.valueOf(typeCode);
    }

    public static EmployeeType[] legalTypeCodes() {
        return EmployeeType.values();
    }

    private static Employee createEmployee(String name, String typeCode) {
        return new Employee(name, typeCode);
    }

    public static Employee createEngineer(String name) {
        return new Employee(name, EmployeeType.ENGINEER.typeCode);
    }
}
