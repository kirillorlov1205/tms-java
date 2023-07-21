package lesson7_exeptions.studentTask;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        System.out.println(message);
    }
}
