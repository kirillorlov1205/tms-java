package lesson8_exeptions.studentTask;

import lesson8_exeptions.studentTask.college.College;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        College.getStudentsList().addAll(
                Arrays.asList(
                        new Student("kirill", 10),
                        new Student("Kombo", 1),
                        new Student("Denis", 2)
                )
        );

        try {
            College.findStudentByName("kirill");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
