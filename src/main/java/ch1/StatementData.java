package ch1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StatementData {


    private String customer;

    private List<Performance> performances;

    public StatementData(Invoice invoice) {
        this.customer = invoice.getCustomer();
        this.performances = invoice.getPerformances();
    }


    public String getCustomer() {
        return customer;
    }
}
