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
            charge = quantity * plan.regularRate + plan.regularServiceCharge;
        }

        return charge;
    }

    private double summerCharge() {
        return quantity * plan.summerRate;
    }

    private boolean summer() {
        return !aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd);
    }
}
