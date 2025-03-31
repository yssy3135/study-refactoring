package ch12;

public class Department extends Party {

    public Integer getAnnualCost() {
        return this.monthlyCost() * 12;
    }

    private Integer monthlyCost() {

        return 0;
    }
}
