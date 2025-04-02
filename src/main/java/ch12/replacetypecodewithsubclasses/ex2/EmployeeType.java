package ch12.replacetypecodewithsubclasses.ex2;

public class EmployeeType {

    private String value;

    public EmployeeType(String aString) {
        this.value = aString;
    }

    public String toString() {
        return value;
    }
}
