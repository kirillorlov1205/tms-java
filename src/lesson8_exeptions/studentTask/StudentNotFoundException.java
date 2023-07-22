package lesson8_exeptions.studentTask;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        System.out.println(message);
    }
}
