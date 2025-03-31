package ch12.pullupconstructorbody;

public class Employee extends Party {
    private String id;
    private String name;
    private int monthlyCost;


    public Employee(String id, String name, int monthlyCost) {
        super(name);
        this.id = id;
        this.monthlyCost = monthlyCost;
    }

}
