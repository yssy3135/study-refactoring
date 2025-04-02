package ch12.replacetypecodewithsubclasses.ex2;

public class Engineer extends EmployeeType {


    public Engineer() {
        super("Engineer");
    }

    public String toString() {
        return "Engineer";
    }
}
