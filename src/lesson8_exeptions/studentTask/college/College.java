package lesson8_exeptions.studentTask.college;

import lesson8_exeptions.studentTask.Student;
import lesson8_exeptions.studentTask.StudentNotFoundException;

import java.util.ArrayList;

public class College {

    private static ArrayList<Student> studentsList = new ArrayList<>();

    public static Student findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : studentsList
        ) {
            if (student.getName().equals(name)) {
                System.out.println(student);
                return student;
            }
        }
        throw new StudentNotFoundException("Student with name: '" + name + "' was not found");
    }

    public static ArrayList<Student> getStudentsList() {
        return studentsList;
    }
}
