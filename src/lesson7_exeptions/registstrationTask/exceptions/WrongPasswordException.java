package lesson7_exeptions.registstrationTask.exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        System.out.println(message);
    }
}
