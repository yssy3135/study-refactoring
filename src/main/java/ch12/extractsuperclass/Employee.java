package ch12.extractsuperclass;

public class Employee extends Party {

    private Long id;
    private Integer monthlyCost;

    public Employee(String name, Long id, Integer monthlyCost) {
        super(name);
        this.id = id;
        this.monthlyCost = monthlyCost;
    }

    public Integer getMonthlyCost() {
        return this.monthlyCost;
    }
    public Long getId() {
        return this.id;
    }

    public Integer getAnnualCost() {
        return this.getMonthlyCost() * 12;
    }

}
