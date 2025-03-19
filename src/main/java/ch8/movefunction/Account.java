package ch8.movefunction;

public class Account {

    protected int daysOverdrawn;
    private AccountType type;

    public double bankCharge() {
        double result = 4.5;
        if (this.daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }

    private double overdraftCharge() {
        if (this.type.isPremium) {
            int bankCharge = 10;
            if (this.daysOverdrawn <= 7) {
                return bankCharge;
            }
            else {
                return bankCharge * (this.daysOverdrawn - 7) * 0.85;
            }
        }
        else {
            return this.daysOverdrawn * 1.75;
        }
    }
}
