package lesson6.hw.task2_employee;

public abstract class Employee implements Printable {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
