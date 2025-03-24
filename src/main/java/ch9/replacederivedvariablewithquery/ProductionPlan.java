package ch9.replacederivedvariablewithquery;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {
    int production;
    List<Adjustment> adjustments = new ArrayList<>();

    public int getProduction() {
        return adjustments.stream()
                .reduce(0, (sum, a) -> sum + a.amount, Integer::sum);
    }

    public void applyAdjustment(Adjustment adjustment) {
        adjustments.add(adjustment);
        production += adjustment.amount;
    }
}