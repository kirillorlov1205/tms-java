package lesson7_abstract_interfaces.practice;

import java.util.Date;

public abstract class Animal {
    private int animalId;
    private String name;
    private Date birthday;

    public Animal(int animalId, String name, Date birthday) {
        this.animalId = animalId;
        this.name = name;
        this.birthday = birthday;
    }

    public abstract void voice();
}