package lesson6_abstract_interfaces.practice;

import java.util.Date;

public class Dog extends Animal{
    double weight;

    public Dog(int animalId, String name, Date birthday, double weight) {
        super(animalId, name, birthday);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Gav-Gav...");
    }
}