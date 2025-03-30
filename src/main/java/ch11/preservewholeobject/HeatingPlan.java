package ch11.preservewholeobject;

public class HeatingPlan {

    TempRange daysTempRange;

    public boolean withinRange(Integer bottom, Integer top) {

        return (bottom >= daysTempRange.low) && (top <= daysTempRange.high);
    }
}
