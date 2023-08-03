package lesson11_collections_2_map_set;

import support.Utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class College {

    Scanner scanner = new Scanner(System.in);
    private HashMap<String, Integer> studentsMarks;

    public College() {
        this.studentsMarks = new HashMap<>();
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
                case 3 -> showQuantityOfStudents();
                case 4 -> showStudentWithLowestMark();
                case 5 -> System.out.println("Good bye!");
            }
        } while (choice != 5);
    }

    public void addStudent() {
        System.out.println("Provide student name");
        String studentName = Utilities.getConsoleString();

        System.out.println("Provide student mark");
        int studentMark = Utilities.getConsoleNumber();

        studentsMarks.put(studentName, studentMark);
        System.out.println("Student: '" + studentName + "' has been added");
    }

    public void showAllStudents() {
        System.out.println(studentsMarks);
    }

    public void showQuantityOfStudents() {
        System.out.println("Quantity of students: '" + studentsMarks.size() + "'");
    }

    public void showStudentWithLowestMark() {
//        TBD I think It should have better solution

        String studentWithLowestMarkName = "";
        int lowestMark = 10;

        if (studentsMarks.size() == 0) {
            System.out.println("There are no students");
            return;
        }

        for (Map.Entry<String, Integer> element : studentsMarks.entrySet()) {
            if (element.getValue() <= lowestMark) {
                studentWithLowestMarkName = element.getKey();
            }
        }

        System.out.println("Student with lowest mark:\n" +
                "name: " + studentWithLowestMarkName + "'\n" +
                "mark: '" + studentsMarks.get(studentWithLowestMarkName) + "'");
    }
}
