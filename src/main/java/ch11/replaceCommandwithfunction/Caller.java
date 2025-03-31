package ch11.replaceCommandwithfunction;

import ch11.replacefunctionwithcommand.MedicalExam;

public class Caller {

    public void call(Customer customer, int usage, Provider provider) {
        double monthCharge = charge(customer, usage, provider);
    }

    public double charge(Customer customer, int usage, Provider provider) {
        double baseCharge = customer.baseRate * usage;
        return baseCharge + provider.connectionCharge;
    }
}
