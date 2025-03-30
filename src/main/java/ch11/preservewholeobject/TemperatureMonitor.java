package ch11.preservewholeobject;

import java.util.List;

public class TemperatureMonitor {


    public void caller(Room aroom, HeatingPlan aPlan, List<String> alert) {
        Integer low = aroom.daysTempRange.low;
        Integer high = aroom.daysTempRange.high;
        if (!aPlan.withinRange(low, high)) {
            alert.add("방 온도가 지정 범위를 벗어났습니다.");
        }
    }

}
