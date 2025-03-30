package ch11.removeflagargument;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Example {


    public LocalDate deliveryDate(Order anOrder, Boolean isRush) {
        if (isRush) {
            return rushDeliveryDate(anOrder);
        } else {
            return regularDeliveryDate(anOrder);
        }
    }

    private static LocalDate regularDeliveryDate(Order anOrder) {
        int deliveryTime;
        if (List.of("MA", "CT", "NY").contains(anOrder.deliveryState)) {
            deliveryTime = 2;
        } else if (List.of("ME", "NH").contains(anOrder.deliveryState)) {
            deliveryTime = 3;
        } else {
            deliveryTime = 4;
        }

        return anOrder.placedOn.plusDays(2 + anOrder.deliveryTime).toLocalDate();
    }

    private static LocalDate rushDeliveryDate(Order anOrder) {
        int deliveryTime;
        if (List.of("MA", "CT").contains(anOrder.deliveryState)) {
            deliveryTime = 1;
        } else if (List.of("NY", "NH").contains(anOrder.deliveryState)) {
            deliveryTime = 2;
        } else {
            deliveryTime = 3;
        }
        return anOrder.placedOn.plusDays(1 + anOrder.deliveryTime).toLocalDate();
    }
}


