package lesson4.hw;

import lesson4.hw.task1.CreditCard;
import lesson4.hw.task2.Computer;
import lesson4.hw.task2.Enums;
import lesson4.hw.task2.Hdd;
import lesson4.hw.task2.Ram;

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


//      Hw task 3 Computer

    }
}