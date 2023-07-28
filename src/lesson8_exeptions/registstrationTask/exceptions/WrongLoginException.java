package lesson8_exeptions.registstrationTask.exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
