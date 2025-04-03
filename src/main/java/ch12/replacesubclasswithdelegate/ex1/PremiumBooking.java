package ch12.replacesubclasswithdelegate.ex1;

import java.time.LocalDateTime;

@Deprecated
public class PremiumBooking extends Booking {

    private Extras extras;

    public PremiumBooking(Show show, LocalDateTime date, Extras extras) {
        super(show, date);
        this.extras = extras;
    }
    public static Booking createPremiumBooking(Show show, LocalDateTime date, Extras extras) {
        Booking result = new Booking(show, date);
        result.bePremiumDelegate(extras);

        return result;
    }

    @Override
    public Double basePrice() {
        return (double) Math.round(super.basePrice() + this.extras.premiumFee);
    }

}
