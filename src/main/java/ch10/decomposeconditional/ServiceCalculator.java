package ch10.decomposeconditional;

import java.time.LocalDateTime;

public class ServiceCalculator {
    LocalDateTime aDate;
    Plan plan;
    Integer quantity;

    public double calculate() {
        double charge = 0;

        if(summer()) {
            charge = summerCharge();
        } else {
            charge = regularCharge();
        }

        return charge;
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
