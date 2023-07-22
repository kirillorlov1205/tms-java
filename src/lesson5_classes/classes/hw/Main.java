package lesson5_classes.classes.hw;

import lesson5_classes.classes.hw.task1.CreditCard;
import lesson5_classes.classes.hw.task2.Computer;
import lesson5_classes.classes.hw.task2.Enums;
import lesson5_classes.classes.hw.task2.Hdd;
import lesson5_classes.classes.hw.task2.Ram;
import lesson5_classes.classes.hw.task3.Atm;

public class Main {
    public static void main(String[] args) {

//      Hw task 1 Credit card
        CreditCard tinkoff = new CreditCard("4565 8459 1265 9874", 100.8);
        CreditCard vtb = new CreditCard("2202 4585 9874 5551");
        CreditCard sberbank = new CreditCard("2202 8456 1112 6598", 320);

        tinkoff.deposit(100.12);
        System.out.println(tinkoff.getCardInfo());

        vtb.deposit(20.2);
        System.out.println(vtb.getCardInfo());

        sberbank.withdraw(50.2);
        System.out.println(sberbank.getCardInfo());

//      Hw task 2 Computer
        Computer computer1 = new Computer(1000.50, "Macbook");
        System.out.println(computer1);

        Computer computer2 = new Computer(2000, "HP", new Ram("Corsair",16), new Hdd("WD", 256, Enums.HDD_TYPES.INTERNAL));
        System.out.println(computer2);

//      Hw task 3 ATM
        Atm atm = new Atm(2,2,2);
        atm.deposit(3);
        System.out.println(atm.withdraw(50));
        System.out.println(atm);
    }
}