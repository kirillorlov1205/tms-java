package lesson6_abstract_interfaces.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog(1, "Tommy", new Date(2015, Calendar.JUNE, 11), 123.12);
        Animal cat = new Cat(2, "Kitty", new Date(2019, Calendar.AUGUST, 8), "Blue");
        Animal tiger = new Tiger(3, "Mao", new Date(2000, Calendar.MARCH, 15),
                "black",
                3);


        ArrayList<Animal> animalsList = new ArrayList<>(Arrays.asList(dog, cat, tiger));

        for (Animal animal : animalsList
        ) {
            animal.voice();
        }
    }
}