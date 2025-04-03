package ch12.replacesubclasswithdelegate.ex1;

import java.time.LocalDateTime;

public class PremiumBooking extends Booking{

    private Extras extras;

    public PremiumBooking(Show show, LocalDateTime date, Extras extras) {
        super(show, date);
        this.extras = extras;
    }
    public static PremiumBooking createBooking(Show show, LocalDateTime date, Extras extras) {
        return new PremiumBooking(show, date, extras);
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
