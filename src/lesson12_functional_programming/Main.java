package lesson12_functional_programming;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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
        Map<Integer, String> users = Map.of(1,"Den",3, "Tonny", 8,"Tom");
        final List<Integer> RANGE = List.of(1,2,5,8,9,13);
        System.out.println(Functions.getFilteredReversedUsersList(users, RANGE));

//      Task 6


    }




}
