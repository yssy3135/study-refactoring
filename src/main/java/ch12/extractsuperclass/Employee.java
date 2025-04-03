package ch12.extractsuperclass;

public class Employee extends Party {

    private String name;
    private Long id;
    private Integer monthlyCost;


    public Integer getMonthlyCost() {
        return this.monthlyCost;
    }
    public String getName() {
        return this.name;
    }
    public Long getId() {
        return this.id;
    }

    public Integer getAnnualCost() {
        return this.getMonthlyCost() * 12;
    }

}
