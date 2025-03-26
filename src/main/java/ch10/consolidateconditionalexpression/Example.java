package ch10.consolidateconditionalexpression;

public class Example {

    private Employee anEmployee;

    public Integer disabilityAmount() {
        if(anEmployee.seniority < 2) return 0;
        if(anEmployee.monthsDisabled > 12) return 0;
        if(anEmployee.isPartTime) return 0;

        return 0;
    }
}
