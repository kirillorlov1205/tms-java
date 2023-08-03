package lesson11_collections_2_map_set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        College college = new College();
        college.menu();

        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1, 0, 5, 5, 5, 1, 0, 3));
        HashMap<Integer, Integer> map = new HashMap<>();

//      Make a map with key = numbers from list / value = quantity of copy
        for (int num : list) {
            map.put(num, Collections.frequency(list, num));
        }
        System.out.println(map);

//      Count quantity of copies
        int quantity = 0;

        for (int num : list) {
            quantity += Collections.frequency(list, num) - 1;
        }
        System.out.println("Quantities of copies: " + quantity);
    }
}
