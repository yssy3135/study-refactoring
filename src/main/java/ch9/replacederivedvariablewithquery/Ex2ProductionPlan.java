package ch9.replacederivedvariablewithquery;

import java.util.ArrayList;
import java.util.List;

public class Ex2ProductionPlan {
    int initialProduction;
    int productionAccumulate;
    List<Adjustment> adjustments = new ArrayList<>();

    public Ex2ProductionPlan(int production) {
        this.initialProduction = production;
        this.productionAccumulate = 0;
        adjustments = new ArrayList<>();

    }

    public int getProduction() {
        assert(this.productionAccumulate == this.calculatedProductionAccumulator());
        return this.initialProduction + this.productionAccumulate;
    }

    public int calculatedProductionAccumulator() {
        return adjustments.stream()
                .reduce(0, (sum, a) -> sum + a.amount, Integer::sum);
    }
}