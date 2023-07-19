package lesson6.hw.task2_employee;

public class Director extends Employee {

    public Director(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void printPosition() {
        System.out.println("Employee: '" + getFirstName() + " " + getLastName() + "' is a director");
    }
}
