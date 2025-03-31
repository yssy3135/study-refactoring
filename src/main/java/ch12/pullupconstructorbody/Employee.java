package ch12.pullupconstructorbody;

public class Employee extends Party {
    private String id;
    private String name;
    private int monthlyCost;


    public Employee(String id, String name, int monthlyCost) {
        this.id = id;
        this.name = name;
        this.monthlyCost = monthlyCost;
    }

}
