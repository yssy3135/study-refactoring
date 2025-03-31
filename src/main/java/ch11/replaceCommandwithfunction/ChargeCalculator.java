package ch11.replaceCommandwithfunction;

public class ChargeCalculator {
//    constructor(customer, usage, provider) {    this._customer = customer;    this._usage = usage;    this._provider = provider;  }  get baseCharge() {    return this._customer.baseRate * this._usage;  }  get charge() {    return this.baseCharge + this._provider.connectionCharge;  }

    private Customer customer;
    private int usage;
    private Provider provider;

    public ChargeCalculator(Customer customer, int usage, Provider provider) {
        this.customer = customer;
        this.usage = usage;
        this.provider = provider;
    }


    public double charge() {
        double baseCharge = customer.baseRate * usage;
        return baseCharge + provider.connectionCharge;
    }


}
