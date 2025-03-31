package ch11.replaceCommandwithfunction;

import ch11.replacefunctionwithcommand.MedicalExam;

public class Caller {

    public void call(Customer customer, int usage, Provider provider) {
        ChargeCalculator chargeCalculator = new ChargeCalculator(customer, usage, provider);
        double monThCharge = chargeCalculator.charge();

    }
}
