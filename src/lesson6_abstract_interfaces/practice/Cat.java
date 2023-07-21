package lesson6_abstract_interfaces.practice;

import java.util.Date;

public class Cat extends Animal{
    private String eyesColor;

    public Cat(int animalId, String name, Date birthday, String eyesColor) {
        super(animalId, name, birthday);
        this.eyesColor = eyesColor;
    }


    @Override
    public void voice() {
        System.out.println("Murrrrr..");
    }
}