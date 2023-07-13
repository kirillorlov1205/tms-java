package lesson4.hw.task2;

public class Hdd {

    private String name;
    private double capacity;
    private Enums.HDD_TYPES type;

    public Hdd(String name, double capacity, Enums.HDD_TYPES type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public Hdd() {
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}