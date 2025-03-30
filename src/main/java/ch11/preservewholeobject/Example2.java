package ch11.preservewholeobject;

import java.util.List;

// 새함수를 다른 방식으로 반들기
public class Example2 {


    public void caller(Room aRoom, HeatingPlan aPlan, List<String> alerts) {
        TempRange tempRange = aRoom.daysTempRange;
        Integer low = tempRange.low;
        Integer high = tempRange.high;

        boolean isWithInRange = aPlan.withinRange(low, high);
        if(!isWithInRange) {
            alerts.add("방 온도가 지정 범위를 벗어났습니다.");
        }

    }


}
