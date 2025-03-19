package ch8.movefunction;

public class Account {

    protected int daysOverdrawn;
    private AccountType type;

    public double bankCharge() {
        double result = 4.5;
        if (this.daysOverdrawn > 0) result += this.type.overdraftCharge(daysOverdrawn);
        return result;
    }
}
