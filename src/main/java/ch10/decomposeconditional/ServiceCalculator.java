package ch10.decomposeconditional;

import java.time.LocalDateTime;

public class ServiceCalculator {
    LocalDateTime aDate;
    Plan plan;
    Integer quantity;

    public double calculate() {

        return summer() ? summerCharge() : regularCharge();
    }

    private double regularCharge() {
        return quantity * plan.regularRate + plan.regularServiceCharge;
    }

    private double summerCharge() {
        return quantity * plan.summerRate;
    }

    private boolean summer() {
        return !aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd);
    }
}
