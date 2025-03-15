package ch7.replacetempwithquery;

public class Order {

    Integer quantity;
    Item item;

    public Order(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

   public double price() {
       return basePrice() * discountFactor();
   }

    private double discountFactor() {
        double discountFactor = 0.98;
        if(basePrice() > 1000) discountFactor -= 0.03;
        return discountFactor;
    }

    private int basePrice() {
        return this.quantity * this.item.price;
    }
}
