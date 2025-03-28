package ch10.introduceassertion;

import java.util.Optional;

public class Customer {

    private double discountRate;

    public double applyDiscount(Double aNumber) {
        if(discountRate < 0) return aNumber;

        assert discountRate >= 0;
        return aNumber - (this.discountRate * aNumber) ;
    }

    public void setDiscountRate(Double aNumber) {
        assert (null == aNumber || aNumber >= 0);
        this.discountRate = aNumber;
    }
}
