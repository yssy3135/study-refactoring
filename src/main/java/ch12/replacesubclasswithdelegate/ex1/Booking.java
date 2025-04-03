package ch12.replacesubclasswithdelegate.ex1;

import java.time.LocalDateTime;

public class Booking {

    Show show;
    private LocalDateTime date;


    public Booking(Show show, LocalDateTime date) {
        this.show = show;
        this.date = date;
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
}
