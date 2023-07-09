package lesson3.collegeSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] arr = {new Student("Kirill", Enums.Groups.GROUP_1, 10),
                new Student("Dany", Enums.Groups.GROUP_1, 2),
                new Student("Denis", Enums.Groups.GROUP_2, 3),
                new Student("Mark", Enums.Groups.GROUP_2, 10.4)
        };

        Journal.getJournal().addAll(Arrays.asList(arr));

        Journal.menu();
    }
}