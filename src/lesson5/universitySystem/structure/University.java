package lesson5.universitySystem.structure;

import lesson5.Utilities;
import lesson5.universitySystem.Staff.Dean;
import lesson5.universitySystem.Staff.Director;
import lesson5.universitySystem.Staff.Employee;
import lesson5.universitySystem.Staff.Rector;

import java.util.ArrayList;

public class University {

    private ArrayList<Student> students;
    private ArrayList<Employee> employees;
    private ArrayList<Dormitory> dormitories;

    public University() {
        students = new ArrayList<>();
        employees = new ArrayList<>();
        dormitories = new ArrayList<>();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("Choose action\n" +
                    "1. Add a student to the University\n" +
                    "2. Add an employee to the University\n" +
                    "3. Add a student to the dormitory\n" +
                    "4. Show all students\n" +
                    "5. Show all employees\n" +
                    "6. Exit");

            choice = Utilities.getConsoleNumber();

            switch (choice) {
                case 1:
                    addStudentToUniversity();
                    break;
                case 2:
                    addEmployeeToUniversity();
                    break;
                case 3:
                    addStudentToDormitory();
                    break;
                case 4:
                    System.out.println(this.students.toString());
                    break;
                case 5:
                    System.out.println(this.employees.toString());
                    break;
                case 6:
                    System.out.println("Good luck!");
                    break;
                default:
                    System.out.println("Unknown action");
                    break;
            }
        } while (choice != 6);
    }

    private void addStudentToUniversity() {
        System.out.println("Provide student first name");
        String firstName = Utilities.getConsoleString();
        System.out.println("Provide student last name");
        String lastName = Utilities.getConsoleString();
        System.out.println("Provide student group");
        int group = Utilities.getConsoleNumber();
        System.out.println("Provide student living place");
        String livingPlace = Utilities.getConsoleString();

        this.students.add(new Student(firstName, lastName, group, livingPlace));
        System.out.println("Student: '" + firstName + " " + lastName + "' has been added to the university ");
    }

    private void addEmployeeToUniversity() {
        System.out.println("Provide employee first name");
        String firstName = Utilities.getConsoleString();
        System.out.println("Provide employee last name");
        String lastName = Utilities.getConsoleString();
        System.out.println("Provide employee position place");
        String position = Utilities.getConsoleString();

        switch (position) {
            case "Director":
                this.employees.add(new Director(firstName, lastName, position));
                System.out.println("Employee: '" + firstName + " " + lastName + "' has been added to the university ");
                break;
            case "Rector":
                this.employees.add(new Rector(firstName, lastName, position));
                System.out.println("Employee: '" + firstName + " " + lastName + "' has been added to the university ");
                break;
            case "Dean":
                this.employees.add(new Dean(firstName, lastName, position));
                System.out.println("Employee: '" + firstName + " " + lastName + "' has been added to the university ");
                break;
            default:
                System.out.println("There is no such position");
                break;
        }
    }

    private void addStudentToDormitory() {

        Dormitory newDormitory = createDormitory();
        Student newStudent = createStudent();

//        newDormitory.getRooms().add()
//        try to resolve the issue
        this.dormitories.add(newDormitory);

        System.out.println("Student: '" + newStudent.getFirstName() + " " + newStudent.getLastName() + "' has been added to the dormitory: '" + newDormitory.getName() + "'");
    }

//    public Dormitory getDormitoryByName(String name) {
//        for (Dormitory dormitory : dormitories
//        ) {
//            if (dormitory.getName().equals(name)) {
//                return dormitory;
//            } else {
//                System.out.println("There is no dormitory with name: '" + dormitory.getName() + "'");
//            }
//        }
//        return null;
//    }

    private Student createStudent() {
        System.out.println("Provide student first name");
        String firstName = Utilities.getConsoleString();

        System.out.println("Provide student last name");
        String lastName = Utilities.getConsoleString();

        System.out.println("Provide student group");
        int group = Utilities.getConsoleNumber();

        System.out.println("Provide student living place");
        String livingPlace = Utilities.getConsoleString();

        return new Student(firstName, lastName, group, livingPlace);
    }

    private Dormitory createDormitory() {
        System.out.println("Provide dormitory address");
        String dormitoryAddress = Utilities.getConsoleString();

        System.out.println("Provide dormitory name");
        String dormitoryName = Utilities.getConsoleString();

        return new Dormitory(dormitoryAddress, dormitoryName);
    }

    private Room createRoom() {
        System.out.println("Provide room number");
        int roomNumber = Utilities.getConsoleNumber();
        return new Room(roomNumber);
    }
}