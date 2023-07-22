package lesson7_abstract_interfaces.hw;

import lesson7_abstract_interfaces.hw.task1_figure.Circle;
import lesson7_abstract_interfaces.hw.task1_figure.Figure;
import lesson7_abstract_interfaces.hw.task1_figure.Square;
import lesson7_abstract_interfaces.hw.task1_figure.Triangle;
import lesson7_abstract_interfaces.hw.task2_employee.Accounted;
import lesson7_abstract_interfaces.hw.task2_employee.Director;
import lesson7_abstract_interfaces.hw.task2_employee.Employee;
import lesson7_abstract_interfaces.hw.task2_employee.Worker;
import lesson7_abstract_interfaces.hw.task3_documentsSystem.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//    Task 1 Figure
        Triangle triangle1 = new Triangle(10, 5, 10, 10, 5);
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Triangle triangle2 = new Triangle(7, 4, 6, 7, 4);
        Circle circle2 = new Circle(7);

        ArrayList<Figure> figuresList = new ArrayList<>(Arrays.asList(triangle1, circle, square, triangle2, circle2));

        for (Figure figure : figuresList
        ) {
            figure.countPerimeter();
        }

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