package lesson1.classes;
import java.util.Scanner;

public class CollegeSystem {

	private static Student[] students;

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Choose action\n" +
					"1. Просмотр студентов\n" +
					"2. Генерация оценок (от 1 до 10).\n" +
					"3. Просмотр лучшего студента (максимальная оценка).\n" +
					"4. Выход");

			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.println("List of students:\n");
					showStudentsList();
					break;
				case 2:
					generateMarks();
					System.out.println("Marks have been generated\n");
					break;
				case 3:
					System.out.println("The best mark is: " + getBestMark() + "\n");
					break;
				case 4:
					System.out.println("Good day!");
					break;
				default:
					System.out.println("Unknown action\n");
			}
		} while (choice != 4);
	}

	public static void createStudentsList() {
		Scanner scanner = new Scanner(System.in);
		int index = 1;

		System.out.println("Provide students quantity");
		int studentQuantity = scanner.nextInt();
		students = new Student[studentQuantity];

		for (int i = 0; i < students.length; i++) {
			System.out.println("Введите студента " + index++);
			Scanner scan = new Scanner(System.in);
			String name="";
			name+=scan.nextLine();
			students[i] = new Student(name);
		}
	}

	public static void showStudentsList() {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	public static void generateMarks() {
		for (int i = 0; i < students.length; i++) {
			students[i].setMark(getRandomNumber(0, 10));
		}
	}

	public static float getBestMark() {
		float bestMark = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getMark() > bestMark) {
				bestMark = students[i].getMark();
			}
		}
		return bestMark;
	}

	public static float getRandomNumber(int min, int max) {
		return (float) ((Math.random() * (max - min)) + min);
	}

}