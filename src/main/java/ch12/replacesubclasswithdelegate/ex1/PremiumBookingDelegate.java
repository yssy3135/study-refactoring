package ch12.replacesubclasswithdelegate.ex1;

public class PremiumBookingDelegate {

    private Booking booking;
    private Extras extras;

    public PremiumBookingDelegate(Booking hostBooking, Extras extras) {
        this.booking = hostBooking;
        this.extras = extras;
    }

}
