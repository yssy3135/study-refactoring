package ch6.inlinevariable;

public class Original {
    public boolean method(Order order) {
        int basePrice = order.basePrice;
        return basePrice > 1000;
    }
}
