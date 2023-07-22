package lesson5_classes.classes.hw.task3;

public class Atm {
    private int quantityOf20;
    private int quantityOf50;
    private int quantityOf100;

    public Atm(int quantityOf20, int quantityOf50, int quantityOf100) {
        this.quantityOf20 = quantityOf20;
        this.quantityOf50 = quantityOf50;
        this.quantityOf100 = quantityOf100;
    }

    public void deposit(int bill) {
        switch (bill) {
            case 20:
                this.quantityOf20 += bill;
                System.out.println("successful deposit");
                break;
            case 50:
                this.quantityOf50 += bill;
                System.out.println("successful deposit");
                break;
            case 100:
                this.quantityOf100 += bill;
                System.out.println("successful deposit");
                break;
            default:
                System.out.println("Invalid bill");
        }
    }

    public boolean withdraw(int amountToWithdraw) {
        boolean status = false;
        switch (amountToWithdraw) {
            case 20:
                this.quantityOf20--;
                status = true;
                break;
            case 50:
                this.quantityOf50--;
                status = true;
                break;
            case 100:
                this.quantityOf100--;
                status = true;
                break;
            default:
                System.out.println("Invalid bill");
        }
        return status;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "quantityOf20=" + quantityOf20 +
                ", quantityOf50=" + quantityOf50 +
                ", quantityOf100=" + quantityOf100 +
                '}';
    }
}