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

}
