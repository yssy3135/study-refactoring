package ch12.replacesubclasswithdelegate.ex1;

import java.time.LocalDateTime;

public class PremiumBooking extends Booking{

    private Extras extras;

    public PremiumBooking(Show show, LocalDateTime date, Extras extras) {
        super(show, date);
        this.extras = extras;
    }
    public static PremiumBooking createPremiumBooking(Show show, LocalDateTime date, Extras extras) {
        PremiumBooking result = new PremiumBooking(show, date, extras);
        result.bePremiumDelegate(extras);

        return result;
    }


    @Override
    public boolean hasTalkback() {
        return this.show.hasOwnProperty("talkback");
    }

    @Override
    public Double basePrice() {
        return (double) Math.round(super.basePrice() + this.extras.premiumFee);
    }

    public Boolean hasDinner() {
        return this.extras.hasOwnProperty("dinner") && !this.isPeakDay();
    }
}
