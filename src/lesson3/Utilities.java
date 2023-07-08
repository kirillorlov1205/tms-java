package lesson3;

import java.util.Scanner;

public class Utilities {
	static Scanner scanner = new Scanner(System.in);

	public static int getConsoleNumber() {
		int num = 0;

		System.out.println("Provide number");

		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Incorrect number, your number will be '0'");
		}

		return num;
	}

	public static void fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
	}
}
