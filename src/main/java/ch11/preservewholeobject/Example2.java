package ch11.preservewholeobject;

import java.util.List;

// 새함수를 다른 방식으로 반들기
public class Example2 {


    public void caller(Room aRoom, HeatingPlan aPlan, List<String> alerts) {
        Integer low = aRoom.daysTempRange.low;
        Integer high = aRoom.daysTempRange.high;

        if(aPlan.withinRange(low, high)) {
            alerts.add("방 온도가 지정 범위를 벗어났습니다.");
        }

    }


}
