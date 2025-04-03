package ch12.replacesubclasswithdelegate.ex1;

import java.time.LocalDateTime;

public class Client {


    public void booking(Show show, LocalDateTime date) {
        Booking aBooking = Booking.createBooking(show, date);
    }

    public void premiumBooking(Show show, LocalDateTime date, Extras extras) {
        PremiumBooking aBooking = PremiumBooking.createPremiumBooking(show, date, extras);
    }
}
