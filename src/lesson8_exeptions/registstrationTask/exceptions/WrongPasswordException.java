package lesson8_exeptions.registstrationTask.exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
