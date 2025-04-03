package ch12.extractsuperclass;

public class Party {

    protected String name;

    protected Integer monthlyCost;

    public Party(String name) {
        this.name = name;
        this.monthlyCost = monthlyCost;
    }


    public String getName() {
        return name;
    }

    public Integer getMonthlyCost() {
        return monthlyCost;
    }

    public Integer getAnnualCost() {
        return this.monthlyCost * 12;
    }
}
