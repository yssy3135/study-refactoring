package ch11.removeflagargument;

import java.time.LocalDate;
import java.util.List;

// 매개변수를 까다로운 방식으로 사용할 때
public class Example2 {

    public LocalDate deliveryDate(Order anOrder, Boolean isRush) {
        LocalDate result;
        Integer deliveryTime;
        if(List.of("MA", "CT").contains(anOrder.deliveryState)) {
            deliveryTime = isRush? 1: 2;
        }else if(List.of("ME", "NH").contains(anOrder.deliveryState)) {
            deliveryTime = 2;
            if(anOrder.deliveryState.equals("NH") && !isRush) {
                deliveryTime = 3;
            }
        }
        else if (isRush) {
            deliveryTime = 3;
        }
        else if(anOrder.deliveryState.equals("ME")) {
            deliveryTime = 3;
        }
        else {
            deliveryTime = 4;
        }

        result = anOrder.placedOn.plusDays(2 + deliveryTime).toLocalDate();
        if(isRush) result = result.minusDays(1);
        return result;
    }

}
