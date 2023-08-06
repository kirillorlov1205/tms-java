package lesson12_functional_programming;

import lesson12_functional_programming.task1.User;
import lesson12_functional_programming.task3.Developer;
import lesson12_functional_programming.task6.IShape;
import lesson12_functional_programming.task7.Printable;
import support.Utilities;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//      Task1 Optional
        Optional<User> user = Functions.getOptionalUser("Kirill");
        User user1 = user.orElse(new User("DEFAULT"));
        System.out.println(user1.getName());

//      Task 2 Words with letter "A"
        List<String> strList = List.of("App", "Bro", "Dr", "Ho");
        Functions.showWordsStartWithLetter("A", strList);

//      Task 3 Filter devs
        List<Developer> devsList = List.of(
                new Developer("Kirill", 1),
                new Developer("Anna", 12),
                new Developer("Anny", 11)
        );
        Functions.filterDevs(devsList);

//      Task 4 sum of filtered Integers
        List<Integer> intsList = List.of(1, 2, 1, 5, 5, 19, 20, 24, 10, 2);
        Functions.showSumOfFilteredIntegers(intsList);

//      Task 5 Get filtered and reversed users list
        Map<Integer, String> users = Map.of(1, "Den", 3, "Tonny", 8, "Tom");
        final List<Integer> RANGE = List.of(1, 2, 5, 8, 9, 13);
        System.out.println(Functions.getFilteredReversedUsersList(users, RANGE));

//      Task 6 IShape
        IShape square;
        square = (a, b) -> a * b;

        IShape triangle;
        triangle = (a, b) -> 0.5 * a * b;

        System.out.println("Area for square: " + square.getSquare(5, 5));
        System.out.println("Area for triangle: " + triangle.getSquare(5, 5));

//------Task 7 Printable
        Printable printable = (a, b) -> {
            if (a < b) {
                System.out.println(a);
            } else if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(0);
            }
        };
        printable.print(20, 20);
        printable.print(10, 20);

//------Task 8 Predicate
        Predicate<Integer> negative = (num) -> num > 0;
        Stream.of(1, 2, 5, 3, -2, -4, 1)
                .filter(negative)
                .forEach(System.out::println);

//------Task 9 Function
        String value = "100 BYN";
        Function<String, String> getInt = str ->
                str + " = " + Integer.parseInt(value.replaceAll("[^0-9]", "")) / 3.2 + " USD";

        System.out.println(getInt.apply("100 BYN"));

//------Task 10
        /*Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
выводить сумму, переведенную сразу в доллары.*/

        Consumer<String> format = a -> a = String.valueOf(
                Integer.parseInt(a.replaceAll("[^0-9]", "")) / 3);
        format.accept(value);
        System.out.println(value);

//------Task 11
        System.out.println("Provide value");
        String newStr = Utilities.getConsoleString();
        Supplier<String> reverse = () -> new StringBuilder(newStr).reverse().toString();
        System.out.println(reverse.get());
    }
}
