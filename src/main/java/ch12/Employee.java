package ch12;

public class Employee extends Party{


    public Integer getAnnualCost() {
        return this.monthlyCost() * 12;
    }

    private Integer monthlyCost() {

        return 0;
    }
}
