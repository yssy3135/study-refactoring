package ch12.pullupMethod;

public class Party {

    public Integer getAnnualCost() {
        return this.monthlyCost() * 12;
    }

    private Integer monthlyCost() {

        return 0;
    }
}
