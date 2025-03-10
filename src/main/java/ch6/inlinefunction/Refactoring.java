package ch6.inlinefunction;

public class Refactoring {
    public int rating(Driver driver) {
        return driver.numberOfLateDeliveries > 5 ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries(Driver driver) {
        return driver.numberOfLateDeliveries > 5;
    }
}
