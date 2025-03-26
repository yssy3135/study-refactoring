package ch10.consolidateconditionalexpression;

public class Example {

    private Employee anEmployee;

    public Integer disabilityAmount() {
        if((anEmployee.seniority < 2)
                || (anEmployee.monthsDisabled > 12)
                ||(anEmployee.isPartTime)) return 0;

        return 0;
    }
}
