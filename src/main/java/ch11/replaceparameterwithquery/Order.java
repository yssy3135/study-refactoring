package ch11.replaceparameterwithquery;

public class Order {
    public double getPrice(int quantity, double itemPrice) {
        double basePrice = quantity * itemPrice;
        int discountLevel = getDiscountLevel(quantity);
        return discountedPrice(basePrice, discountLevel);
    }

    private static int getDiscountLevel(int quantity) {
        return quantity > 100 ? 2 : 1;
    }

    private double discountedPrice(double basePrice, int discountLevel) {
        return switch (discountLevel) {
            case 1 -> basePrice * 0.95;
            case 2 -> basePrice * 0.9;
            default -> throw new IllegalArgumentException("no such discount level");
        };
    }
}
