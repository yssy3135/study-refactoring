package ch6.combinefunctionclass;

public class Reading {
    protected Customer customer;
    protected int quantity;
    protected int month;
    protected int year;

    public Reading(String customer, int quantity, int month, int year) {
        this.customer = new Customer(customer);
        this.quantity = quantity;
        this.month = month;
        this.year = year;
    }

    public Reading(Reading aReading) {
        this.customer = aReading.getCustomer();
        this.quantity = aReading.getQuantity();
        this.month = aReading.getMonth();
        this.year = aReading.getYear();
    }

    public double baseCharge() {
        return baseRate() * quantity;
    }

    private double baseRate() {
        return 0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
