package lesson7_abstract_interfaces.hw.task2_employee;

public class Worker extends Employee{

    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void printPosition() {
        System.out.println("Employee: '" + getFirstName() + " " + getLastName() + "' is a worker");
    }
}
