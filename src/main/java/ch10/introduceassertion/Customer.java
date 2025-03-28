package ch10.introduceassertion;

import java.util.Optional;

public class Customer {

    private double discountRate;

    public double applyDiscount(Integer aNumber) {
        if(discountRate < 0) return aNumber;

        assert discountRate >= 0;
        return aNumber - (this.discountRate * aNumber) ;
    }
}
