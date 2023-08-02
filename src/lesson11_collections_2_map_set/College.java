package lesson11_collections_2_map_set;

import support.Utilities;

import java.util.HashMap;
import java.util.Scanner;

public class College {

    Scanner scanner = new Scanner(System.in);
    private HashMap<String, Integer> studentsList;

    public College() {
        this.studentsList = new HashMap<>();
    }


    public void menu() {
        int choice = 0;

        do {
            System.out.println("\n" +
                    "Choose option:\n" +
                    "1. Add a student\n" +
                    "2. Show all students\n" +
                    "3. Show quantity of students\n" +
                    "4. Show a student with lowest mark\n" +
                    "5. Exit");

            choice = Utilities.getConsoleNumber();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> showAllStudents();
//                case 3 ->
            }
        } while (choice != 5);
    }

    public void addStudent() {
        System.out.println("Provide student name");
        String studentName = Utilities.getConsoleString();

        System.out.println("Provide student mark");
        int studentMark = Utilities.getConsoleNumber();

        studentsList.put(studentName, studentMark);
        System.out.println("Student: '" + studentName + "' has been added");
    }

    public void showAllStudents() {
        System.out.println(studentsList);
    }

    public void showQuantityOfStudents() {

    }
}
