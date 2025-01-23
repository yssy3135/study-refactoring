package ch1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StatementData {


    private String customer;

    private List<Performance> performances;

    public StatementData(Invoice invoice, List<Performance> performances) {
        this.customer = invoice.getCustomer();
        this.performances = performances;
    }


    public String getCustomer() {
        return customer;
    }

    public List<Performance> getPerformances() {
        return performances;
    }
}
