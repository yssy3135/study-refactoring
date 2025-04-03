package ch12.replacesubclasswithdelegate.ex1;

import java.time.LocalDateTime;

public class Booking {

    Show show;
    private LocalDateTime date;
    protected PremiumBookingDelegate premiumBookingDelegate;


    public Booking(Show show, LocalDateTime date) {
        this.show = show;
        this.date = date;
    }

    public static Booking createBooking(Show show, LocalDateTime date) {
        return new Booking(show, date);
    }

    public boolean hasTalkback() {
        return this.show.hasOwnProperty("talkback") && this.isPeakDay();
    }

    protected boolean isPeakDay() {
        return false;
    }

    public Double basePrice() {
        Double result = this.show.price;
        if(this.isPeakDay()) result += Math.round(result * 0.15);
        return result;
    }

    protected void bePremiumDelegate(Extras extras) {
        this.premiumBookingDelegate = new PremiumBookingDelegate(this, extras);
    }
}
