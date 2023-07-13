package lesson4.hw.task2;

public class Ram {

    private String name;
    private double capacity;

    public Ram(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Ram() {
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
