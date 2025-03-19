package ch8.movefield;

import java.time.LocalDateTime;

public class Customer {
    String name;
    CustomerContract customerContract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.customerContract = new CustomerContract(LocalDateTime.now());
        this.setDiscountRate(discountRate);
    }

    public double getDiscountRate() {
        return customerContract.discountRate;
    }

    private void setDiscountRate(double discountRate) {
        this.customerContract.discountRate = discountRate;
    }

    public void becomePreferred() {
        setDiscountRate(getDiscountRate() + 0.03);
    }

    public int applyDiscount(int amount) {
        return Math.subtractExact(amount, (int) (amount * getDiscountRate()));
    }


}
