package ch12.replacetypecodewithsubclasses.ex2;

public class EmployeeType {

    protected String type;

    public EmployeeType(String type) {
        this.type = type;
    }

    public String capitalizedType() {
        return this.type.substring(0, 1).toUpperCase() + this.type.substring(1).toLowerCase();
    }

}
