package ch6.splitphase;

public class Refactoring {
    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;
        PriceData priceData = new PriceData();
        priceData.basePrice = basePrice;
        priceData.quantity = quantity;
        int price = applyShipping(priceData, shippingMethod, discount);
        return price;
    }

    private int applyShipping(PriceData priceData, ShippingMethod shippingMethod, int discount) {
        int shippingPerCase = priceData.basePrice > shippingMethod.discountThreshold ?
                shippingMethod.discountFee :
                shippingMethod.feePerCase;
        int shippingCost = priceData.quantity * shippingPerCase;
        int price = priceData.basePrice - discount * shippingCost;
        return price;
    }
}
