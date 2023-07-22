package lesson5_classes.classes.practise;

public class Cat {
    private String name;
    private int age;
    private int saturation;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.saturation = 0;
    }

    public boolean feed(int food) {
        this.saturation += food;
        return this.saturation >= 100;
    }
}