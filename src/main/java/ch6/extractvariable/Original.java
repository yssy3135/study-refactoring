package ch6.extractvariable;

public class Original {

    public double price(Order order) {
        // 가격(price) = 기본가격 - 수량 할인 + 배송비
        return order.quantity * order.itemPrice -
                Math.max(0, order.quantity - 500) * order.itemPrice * 0.05 +
                Math.min(order.quantity * order.itemPrice * 0.1 , 100);
    }
}
