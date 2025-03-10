package ch6.extractvariable;

public class Refactoring {
    public double price(Order order) {
        // 가격(price) = 기본가격 - 수량 할인 + 배송비
        Integer basePrice = order.quantity * order.itemPrice;

        double quantityDiscount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05;
        double shipping = Math.min(basePrice * 0.1, 100);
        return basePrice - quantityDiscount + shipping;
    }
}
