package ch10.consolidateconditionalexpression;

public class AndExample {

    private Employee anEmployee;

    public double disabilityAmount() {
        if((anEmployee.onVacation)
            && (anEmployee.seniority > 10)) {
            return 1;
        }

        return 0.5;
    }


}
