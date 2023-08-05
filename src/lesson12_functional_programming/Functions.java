package lesson12_functional_programming;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Functions {

    //      Task1 Optional
    public static Optional<User> getOptionalUser(String name) {
        User user = new User(name);
        return Optional.ofNullable(null);
    }

    //      Task 2 Words with letter "A"
    public static void showWordsStartWithLetter(String letter, List<String> strList) {
        strList.stream()
                .filter(word -> word.startsWith(letter))
                .forEach(System.out::println);
    }

    //      Task 3 Filter devs
    public static void filterDevs(List<Developer> devsList) {
        devsList.stream()
                .filter(dev -> dev.getId() > 10 && dev.getName().startsWith("An"))
                .forEach(System.out::println);
    }


    //      Task 4 sum of filtered Integers
    public static void showSumOfFilteredIntegers(List<Integer> intsList) {
        int sum = intsList.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum is: '" + sum + "'");
    }

    //    Task 5 Map
    public static List<String> getFilteredReversedUsersList(Map<Integer, String> users, List<Integer> range) {
        return users.entrySet().stream()
                .filter(entry -> entry.getKey() != null
                        && range.contains(entry.getKey())
                        && entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .toList();
    }

//    Task 6 Get date
    /*Написать программу для вывода на консоль названия дня недели по введенной дате.
     */

//    public static getDayByDate(Date date) {
//
//    }


}
