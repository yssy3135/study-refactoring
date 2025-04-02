package ch12.replacetypecodewithsubclasses.ex2;

public class Salesperson extends EmployeeType {


    public Salesperson() {
        super("Salesperson");
    }

    public String toString() {
        return "Salesperson";
    }
}
