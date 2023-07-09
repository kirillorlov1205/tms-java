package lesson3.collegeSystem;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		System.journal.add(new Student("Kirill", Enums.Groups.GROUP_1, 10));
		System.journal.add(new Student("Dany", Enums.Groups.GROUP_1, 2));
		System.journal.add(new Student("Denis", Enums.Groups.GROUP_2, 3));
		System.journal.add(new Student("Mark", Enums.Groups.GROUP_2, 10.4));

		System.menu();
	}
}