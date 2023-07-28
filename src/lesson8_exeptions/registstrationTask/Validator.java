package lesson8_exeptions.registstrationTask;

import lesson8_exeptions.registstrationTask.exceptions.WrongLoginException;
import lesson8_exeptions.registstrationTask.exceptions.WrongPasswordException;

public class Validator {

    public static boolean validateLogin(String login) throws WrongLoginException {
        if (Validator.containsNumbers(login)) {
            throw new WrongLoginException("login contains spaces\n"
                    + "Your login: '" + login + "'");
        }
        if (Validator.isOverLength(login)) {
            throw new WrongLoginException("Login must contain less then 20 symbols\n"
                    + "Your login contains: " + login.length() + " symbols");
        }
        return true;
    }

    public static boolean validatePassword(String password) throws WrongPasswordException {
        if (Validator.containsNumbers(password)) {
            throw new WrongPasswordException("Password contains spaces\n"
                    + "Your password: '" + password + "'");
        }
        if (Validator.isOverLength(password)) {
            throw new WrongPasswordException("Password must contain less then 20 symbols\n"
                    + "Your password contains: " + password.length() + " symbols");
        }
        if (!Validator.containsNumber(password)) {
            throw new WrongPasswordException("Password must contain a number\n" +
                    "Your password: '" + password + "'");
        }
        return true;
    }

    public static boolean validateConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!Validator.confirmPasswordMatch(password, confirmPassword)) {
            throw new WrongPasswordException("Confirm password should match password \n" +
                    "Password: '" + password + "'\n" +
                    "Confirm password: '" + confirmPassword + "'");
        }
        return true;
    }

    public static boolean containsNumbers(String login) {
        for (int i = 0; i < login.length(); i++) {
            if (login.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

    public static boolean isOverLength(String login) {
        return login.length() >= 20;
    }

    public static boolean containsNumber(String login) {
        char[] chars = login.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean confirmPasswordMatch(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}
