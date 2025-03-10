package ch6.changefunctiondeclation;

import java.util.List;

public class Customer {

    Address address;


    public boolean inNewEngland(Customer aCustomer) {
        return List.of("MA", "CT", "ME", "VT", "NH", "RI").contains(this.address.state);
    }

    public List<Customer> getEnglandCustomers(List<Customer> customers) {
        return customers.stream().filter(c -> c.inNewEngland(c)).toList();
    }

}


