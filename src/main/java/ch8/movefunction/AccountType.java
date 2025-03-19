package ch8.movefunction;

public class AccountType {
    protected boolean isPremium;

    public double overdraftCharge(Integer daysOverdrawn) {
        if (isPremium) {
            int bankCharge = 10;
            if (daysOverdrawn <= 7) {
                return bankCharge;
            }
            else {
                return bankCharge * (daysOverdrawn - 7) * 0.85;
            }
        }
        else {
            return daysOverdrawn * 1.75;
        }
    }
}

