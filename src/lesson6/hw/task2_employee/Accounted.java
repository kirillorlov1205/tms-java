package lesson6.hw.task2_employee;

public class Accounted extends Employee{

    public Accounted(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void printPosition() {
        System.out.println("Employee: '" + firstName + " " + lastName + "' is an accounted");
    }
}
