package ch6.splitphase;

public class Refactoring {
    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;
        PriceData priceData = new PriceData();
        priceData.basePrice = basePrice;
        int price = applyShipping(priceData, shippingMethod, quantity, discount);
        return price;
    }

    private int applyShipping(PriceData basePrice, ShippingMethod shippingMethod, int quantity, int discount) {
        int shippingPerCase = basePrice.basePrice > shippingMethod.discountThreshold ?
                shippingMethod.discountFee :
                shippingMethod.feePerCase;
        int shippingCost = quantity * shippingPerCase;
        int price = basePrice.basePrice - discount * shippingCost;
        return price;
    }
}
