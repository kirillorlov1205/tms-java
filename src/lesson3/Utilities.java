package lesson3;

import java.util.Scanner;

public class Utilities {
	static Scanner scanner = new Scanner(System.in);

	public static int getConsoleNumber() {
		int num = 0;
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

	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int element : arr) {
			if (min > element) {
				min = element;
			}
		}
		return min;
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int element : arr) {
			if (max < element) {
				max = element;
			}
		}
		return max;
	}
}