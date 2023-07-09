package lesson3.collegeSystem;

public class Main {
	public static void main(String[] args) {

		Student student1 = new Student("Kirill", Enums.Groups.GROUP_1, 10);
		Student student2 = new Student("Dany", Enums.Groups.GROUP_1, 2);
		Student student3 = new Student("Denis", Enums.Groups.GROUP_2, 3);
		Student student4 = new Student("Mark", Enums.Groups.GROUP_2, 10.4);

		System.journal.add(student1);
		System.journal.add(student2);
		System.journal.add(student3);
		System.journal.add(student4);

		java.lang.System.out.println(System.journal);

		System.menu();
	}
}
