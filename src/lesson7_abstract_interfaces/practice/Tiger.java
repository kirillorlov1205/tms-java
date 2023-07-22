package lesson7_abstract_interfaces.practice;

import java.util.Date;

public class Tiger extends Cat {
    private int countEatenEmployees;

    public Tiger(int animalId, String name, Date birthday, String eyesColor, int countEatenEmployees) {
        super(animalId, name, birthday, eyesColor);
        this.countEatenEmployees = countEatenEmployees;
    }

    @Override
    public void voice() {
        System.out.println("Rrrrrrrr...");
    }
}