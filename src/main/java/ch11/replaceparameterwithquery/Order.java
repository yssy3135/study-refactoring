package ch11.replaceparameterwithquery;

public class Order {

    private int quantity;

    public double getPrice(double itemPrice) {
        double basePrice = quantity * itemPrice;
        return discountedPrice(basePrice);
    }

    private int getDiscountLevel() {
        return quantity > 100 ? 2 : 1;
    }

    private double discountedPrice(double basePrice) {
        return switch (getDiscountLevel()) {
            case 1 -> basePrice * 0.95;
            case 2 -> basePrice * 0.9;
            default -> throw new IllegalArgumentException("no such discount level");
        };
    }
}
