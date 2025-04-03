package ch12.replacesubclasswithdelegate.ex1;

public class PremiumBookingDelegate {

    private Booking host;
    private Extras extras;

    public PremiumBookingDelegate(Booking hostBooking, Extras extras) {
        this.host = hostBooking;
        this.extras = extras;
    }

    public Boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }


    public Double basePrice() {
        return (double) Math.round(host.privateBasePrice() + this.extras.premiumFee);
    }

    public Double extendBasePrice(Double base) {
        return (double) Math.round(base + this.extras.premiumFee);
    }


    public Boolean hasDinner() {
        return this.extras.hasOwnProperty("dinner") && !this.host.isPeakDay();
    }
}
