package lesson5_classes.hw.task1;

public class CreditCard {
    private String number;
    private double amount;

    public CreditCard (String number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    public CreditCard (String number) {
        this.number = number;
        this.amount = 0;
    }

    public void deposit(double amountToDeposit) {
        this.amount += amountToDeposit;
    }

    public void withdraw(double amountToWithdraw) {
        this.amount -= amountToWithdraw;
    }

    public String getCardInfo() {
        return "Card number = '" + this.number + "' | " + "amount = '" + this.amount + "'";
    }
}