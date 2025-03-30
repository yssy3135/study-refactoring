package ch11.replaceparameterwithquery;

public class Order {
    public double getPrice(int quantity, double itemPrice) {
        double basePrice = quantity * itemPrice;
        int discountLevel;
        if (quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }
        return discountedPrice(basePrice, discountLevel);
    }

    private double discountedPrice(double basePrice, int discountLevel) {
        return switch (discountLevel) {
            case 1 -> basePrice * 0.95;
            case 2 -> basePrice * 0.9;
            default -> throw new IllegalArgumentException("no such discount level");
        };
    }
}
