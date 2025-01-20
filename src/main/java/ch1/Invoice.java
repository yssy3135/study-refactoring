package ch1;

public class Invoice {

    private String customer;
    private Performance[] performances;

    public Invoice(String customer, Performance[] performances) {
        this.customer = customer;
        this.performances = performances;
    }

    public String getCustomer() {
        return customer;
    }

    public Performance[] getPerformances() {
        return performances;
    }

    public Invoice() {
    }
}
