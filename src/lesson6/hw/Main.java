package lesson6.hw;

import lesson6.hw.task2_employee.Accounted;
import lesson6.hw.task2_employee.Director;
import lesson6.hw.task2_employee.Employee;
import lesson6.hw.task2_employee.Worker;
import lesson6.hw.task3_documentsSystem.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//    Task 1 Figure

//    Task 2 Employee
        Director director = new Director("kirill", "Orlov");
        Accounted accounted = new Accounted("Danny", "Dzhonse");
        Worker worker = new Worker("Tomm", "Hasty");

        ArrayList<Employee> listOfEmployees = new ArrayList<>(Arrays.asList(director, accounted, worker));

        for (Employee employee : listOfEmployees
        ) {
            employee.printPosition();
        }

//    Task 3 Documents register system
        EmployeeContract employeeContract = new EmployeeContract(12045,
                new Date(2023, Calendar.MAY, 14), new Date(2025, Calendar.AUGUST, 2), "Dora");
        ProductShippingContract productShippingContract = new ProductShippingContract(13057,
                new Date(2023, Calendar.JUNE, 14), "Furniture", 100);
        Invoice invoice = new Invoice(11106,
                new Date(2023, Calendar.MAY, 21), 6, 1001);

        Register.addDocument(employeeContract);
        Register.addDocument(productShippingContract);
        Register.addDocument(invoice);

        System.out.println(Register.getDocumentsList().toString());
    }
}