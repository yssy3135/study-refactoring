package ch9.replacederivedvariablewithquery;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {
    int production;
    List<Adjustment> adjustments = new ArrayList<>();

    public int getProduction() {
        return production;
    }

    public void applyAdjustment(Adjustment adjustment) {
        adjustments.add(adjustment);
        production += adjustment.amount;
    }
}