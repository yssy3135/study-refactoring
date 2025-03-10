package ch6.extractfunction;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class extractfunction {

    @Test
    public void printOwing() {
        // given
        List<Order> orders = List.of(new Order(1000));
        Invoice invoice = new Invoice(orders, LocalDateTime.now(), "홍길동");
        // when
        Refactoring refactoring = new Refactoring();

        refactoring.printOwing(invoice);

    }
}
