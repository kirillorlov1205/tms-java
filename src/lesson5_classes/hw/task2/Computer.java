package lesson5_classes.hw.task2;

public class Computer {

    private double cost;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(double cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}