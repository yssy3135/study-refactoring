package ch10.consolidateconditionalexpression;

public class Example {

    private Employee anEmployee;

    public Integer disabilityAmount() {
        if(isNotEligibleForDisability()) return 0;

        return 0;
    }

    private boolean isNotEligibleForDisability() {
        return (anEmployee.seniority < 2)
                || (anEmployee.monthsDisabled > 12)
                || (anEmployee.isPartTime);
    }
}
