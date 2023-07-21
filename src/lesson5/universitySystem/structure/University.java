package lesson5.universitySystem.structure;

import lesson5.universitySystem.Staff.Dean;
import lesson5.universitySystem.Staff.Director;
import lesson5.universitySystem.Staff.Employee;
import lesson5.universitySystem.Staff.Rector;
import support.Utilities;

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
                    System.out.println(this.students.toString());
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

    private void addStudentToUniversity() {
        Student newStudent = createStudent();

        this.students.add(newStudent);
        System.out.println("Student: '" + newStudent.getFirstName() + " " + newStudent.getLastName() + "' has been added to the university ");
    }

    private void addEmployeeToUniversity() {
        Employee newEmployee = createEmployee();
        this.employees.add(newEmployee);
        System.out.println("Employee {name: '" + newEmployee.getFirstName() + " " + newEmployee.getLastName() + "', position: '" + newEmployee.getPosition() + "'} has been added to the university");
    }

    private void addStudentToDormitory() {

        System.out.println("Provide student first name");
        String firstName = Utilities.getConsoleString();
        System.out.println("Provide student last name");
        String lastName = Utilities.getConsoleString();
        Student newStudent = getStudentByName(firstName, lastName);

        Dormitory newDormitory = getDormitoryByName();
        String dormitoryName = newDormitory.getName();

        System.out.println("Provide room number");
        int roomNumber = Utilities.getConsoleNumber();

        if (newDormitory.getName().equals(dormitoryName) &&
                newStudent.getFirstName().equals(firstName) &&
                newStudent.getLastName().equals(lastName)) {
            newDormitory.getRoomByNumber(roomNumber).getStudentsList().add(newStudent);

            System.out.println("Student: '" + newStudent.getFirstName() + " " + newStudent.getLastName() + "' has been added to the dormitory: '" + newDormitory.getName() + "'");
        } else {
            System.out.println("Invalid info provided");
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
        String firstName = Utilities.getConsoleString();

        System.out.println("Provide student last name");
        String lastName = Utilities.getConsoleString();

        System.out.println("Provide student group");
        int group = Utilities.getConsoleNumber();

        System.out.println("Provide student living place");
        String livingPlace = Utilities.getConsoleString();

        return new Student(firstName, lastName, group, livingPlace);
    }
    private Employee createEmployee() {
        System.out.println("Provide employee first name");
        String firstName = Utilities.getConsoleString();
        System.out.println("Provide employee last name");
        String lastName = Utilities.getConsoleString();
        System.out.println("Provide employee position place");
        String position = Utilities.getConsoleString();

        switch (position) {
            case "Director" -> {
                return new Director(firstName, lastName, position);
            }
            case "Rector" -> {
                return new Rector(firstName, lastName, position);
            }
            case "Dean" -> {
                return new Dean(firstName, lastName, position);
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