package ch6.splitphase;

public class Refactoring {
    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        PriceData priceData = calculatePricingData(product, quantity);
        int price = applyShipping(priceData, shippingMethod);
        return price;
    }

    private int applyShipping(PriceData priceData, ShippingMethod shippingMethod) {
        int shippingPerCase = priceData.basePrice > shippingMethod.discountThreshold ?
                shippingMethod.discountFee :
                shippingMethod.feePerCase;
        int shippingCost = priceData.quantity * shippingPerCase;
        int price = priceData.basePrice - priceData.quantity * shippingCost;
        return price;
    }


    public PriceData calculatePricingData(Product product, int quantity) {
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;
        PriceData priceData = new PriceData();
        priceData.basePrice = basePrice;
        priceData.quantity = quantity;

        priceData.discount = discount;
        return priceData;
    }
}
