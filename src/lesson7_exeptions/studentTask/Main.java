package lesson7_exeptions.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Student> studentsList = new ArrayList<>(
            Arrays.asList(
                    new Student("kirill", 10),
                    new Student("Kombo", 1),
                    new Student("Denis", 2)
            )
    );

    public static void main(String[] args) {
        try {
            findStudentByName("kirill");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : studentsList
        ) {
            if (student.getName().equals(name)) {
                System.out.println(student);
                return;
            }
        }
        throw new StudentNotFoundException("Student with name: '" + name + "' was not found");
    }
}
