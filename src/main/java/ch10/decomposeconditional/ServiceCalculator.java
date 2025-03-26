package ch10.decomposeconditional;

import java.time.LocalDateTime;

public class ServiceCalculator {
    LocalDateTime aDate;
    Plan plan;
    Integer quantity;

    public double calculate() {
        double charge = 0;

        if(!aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd)) {
            charge = quantity * plan.summerRate;
        } else {
            charge = quantity * plan.regularRate + plan.regularServiceCharge;
        }

        return charge;
    }
}
