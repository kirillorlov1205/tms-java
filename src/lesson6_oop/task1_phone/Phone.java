package lesson6_oop.task1_phone;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("'" + callerName + "' is calling");
    }

    public void receiveCall(String callerName, int callerNumber) {
        System.out.println("'" + callerName + "' is calling from number: '" +
                callerNumber + "'");
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage(int... numbers) {
        for (int number : numbers
        ) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
