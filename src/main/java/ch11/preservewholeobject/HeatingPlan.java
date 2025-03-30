package ch11.preservewholeobject;

import ch10.decomposeconditional.Plan;

public class HeatingPlan {

    TempRange daysTempRange;

    public boolean withinRange(Integer bottom, Integer top) {

        return (bottom >= daysTempRange.low) && (top <= daysTempRange.high);
    }

    public boolean xxNewWithinRange(HeatingPlan plan, TempRange tempRange) {

        Integer low = tempRange.low;
        Integer high = tempRange.high;

        boolean isWithInRange = plan.withinRange(low, high);

        return isWithInRange;
    }
}
