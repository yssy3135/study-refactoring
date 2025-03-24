package ch9.replacederivedvariablewithquery;

import java.util.ArrayList;
import java.util.List;

public class Ex2ProductionPlan {
    int production;
    List<Adjustment> adjustments = new ArrayList<>();

    public int getProduction() {
        return this.production;
    }

    public void applyAdjustment(Adjustment anAdjustment) {
        adjustments.add(anAdjustment);
        this.production += anAdjustment.amount;
    }
}