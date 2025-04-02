package ch12.replacetypecodewithsubclasses.ex2;

public class Manager extends EmployeeType {

    public Manager() {
        super("Manager");
    }

    public String toString() {
        return "Manager";
    }
}
