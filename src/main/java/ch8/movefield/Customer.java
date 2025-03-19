package ch8.movefield;

import java.time.LocalDateTime;

public class Customer {
    String name;
    double discountRate;
    CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.discountRate = discountRate;
        this.contract = new CustomerContract(LocalDateTime.now());
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void becomePreferred() {
        discountRate += 0.03;
    }

    public void applyDiscount() {
        discountRate -= 0.05;
    }


}
