package lesson6_oop.universitySystem.structure;

import lesson6_oop.universitySystem.Position;
import support.Utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class University {

    private final Scanner SCANNER = new Scanner(System.in);

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
            System.out.println("\n" +
                    "Choose action\n" +
                    "1. Add a student to the University\n" +
                    "2. Add an employee to the University\n" +
                    "3. Add a student to the dormitory\n" +
                    "4. Show all students\n" +
                    "5. Show dormitory by name\n" +
                    "6. Show all employees\n" +
                    "7. Exit");

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
                    showStudents();
                    break;
                case 5:
                    System.out.println(getDormitoryByName().toString());
                    break;
                case 6:
                    System.out.println(this.employees.toString());
                    break;
                case 7:
                    System.out.println("Good luck!");
                    break;
                default:
                    System.out.println("Unknown action");
                    break;
            }
        } while (choice != 7);
    }

    public void showStudents() {
        if (this.students.isEmpty()) {
            System.out.println("No students, they are at home. You better go too.");
            return;
        }
        System.out.println(this.students.toString());
    }

    private void addStudentToUniversity() {
        Student newStudent = createStudent();
        this.students.add(newStudent);
        System.out.println("Student: '" + newStudent.getFirstName() + " " + newStudent.getLastName() +
                "' has been added to the university ");
    }

    private void addEmployeeToUniversity() {
        Employee newEmployee = createEmployee();

        if (newEmployee != null) {
            this.employees.add(newEmployee);
            System.out.println("Employee {name: '" + newEmployee.getFirstName() + " " + newEmployee.getLastName()
                    + "', position: '" + newEmployee.getPosition() + "'} has been added to the university");
        }
    }

    private void addStudentToDormitory() {

        System.out.println("Provide student first name");
        String firstName = Utilities.getConsoleString();

        System.out.println("Provide student last name");
        String lastName = Utilities.getConsoleString();

        Student newStudent = getStudentByName(firstName, lastName);

        if (newStudent != null) {
            Dormitory newDormitory = getDormitoryByName();

            if (newDormitory != null) {
                System.out.println("Provide room number");
                Room newRoom = newDormitory.getRoomByNumber(Utilities.getConsoleNumber());

                if (newRoom != null) {
                    newRoom.getStudentsList().add(newStudent);
                    System.out.println("Student: '" + newStudent.getFirstName() + " " + newStudent.getLastName() +
                            "' has been added to the dormitory: '" + newDormitory.getName() + "'");
                }
            }
        }
    }

    public Dormitory getDormitoryByName() {
        System.out.println("Provide dormitory name");
        String dormitoryName = Utilities.getConsoleString();
        for (Dormitory dormitory : dormitories) {
            if (dormitory.getName().equals(dormitoryName)) {
                return dormitory;
            }
        }
        System.out.println("There is no dormitory with name: '" + dormitoryName + "'");
        return null;
    }

    private Student createStudent() {
        System.out.println("Provide student first name");
        String firstName = SCANNER.nextLine();
        System.out.println("Provide student last name");
        String lastName = SCANNER.nextLine();
        System.out.println("Provide student group");
        int group = Utilities.getConsoleNumber();
        System.out.println("Provide student living place");
        String livingPlace = SCANNER.nextLine();

        return new Student(firstName, lastName, group, livingPlace);
    }

    private Employee createEmployee() {
        System.out.println("Provide employee first name");
        String firstName = SCANNER.nextLine();
        System.out.println("Provide employee last name");
        String lastName = SCANNER.nextLine();
        System.out.println("Provide employee position place");
        String position = SCANNER.nextLine();

        switch (position) {
            case "Director" -> {
                return new Employee(firstName, lastName, Position.DIRECTOR);
            }
            case "Rector" -> {
                return new Employee(firstName, lastName, Position.RECTOR);
            }
            case "Dean" -> {
                return new Employee(firstName, lastName, Position.DEAN);
            }
            default -> System.out.println("There is no such position");
        }
        return null;
    }

    public Student getStudentByName(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        System.out.println("There is no student with name: '" + firstName + " " + lastName);
        return null;
    }

    public ArrayList<Dormitory> getDormitories() {
        return dormitories;
    }
}