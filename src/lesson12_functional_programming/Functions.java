package lesson12_functional_programming;

import lesson12_functional_programming.task1.User;

import java.util.Optional;

public class Functions {

    public static Optional<User> getOptionalUser(String name) {
        User user = new User(name);
        return Optional.ofNullable(new User());
    }
}
