package ch6.changefunctiondeclation;

import java.util.List;

public class RefactorCustomer {

    Address address;


    public boolean inNewEngland(RefactorCustomer aCustomer) {
        String stateCode = this.address.state;
        return xxNewInNewEngland(stateCode);
    }

    private static boolean xxNewInNewEngland(String stateCode) {
        return List.of("MA", "CT", "ME", "VT", "NH", "RI").contains(stateCode);
    }

    public List<RefactorCustomer> getEnglandCustomers(List<RefactorCustomer> customers) {
        return customers.stream().filter(c -> c.inNewEngland(c)).toList();
    }

}


