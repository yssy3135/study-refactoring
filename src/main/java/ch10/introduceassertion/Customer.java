package ch10.introduceassertion;

import java.util.Optional;

public class Customer {

    private double discountRate;

    public double applyDiscount(Integer aNumber) {

        return this.discountRate > 0 ? aNumber - (this.discountRate * aNumber) : aNumber;
    }
}
