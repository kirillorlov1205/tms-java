package lesson7_exeptions.registstrationTask;

import lesson7_exeptions.registstrationTask.exceptions.WrongLoginException;
import lesson7_exeptions.registstrationTask.exceptions.WrongPasswordException;

public class Registration {

    public static void register(String login, String password, String confirmPassword) {
        try {
            Validator.validateLogin(login);
            Validator.validatePassword(password);
            Validator.validateConfirmPassword(password, confirmPassword);
            System.out.println("User was registered successfully");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}