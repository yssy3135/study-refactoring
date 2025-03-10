package ch6.inlinefunction;

public class Original {
    public int rating(Driver driver) {
        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries(Driver driver) {
        return driver.numberOfLateDeliveries > 5;
    }
}
