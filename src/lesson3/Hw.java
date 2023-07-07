package lesson3;

import java.util.Scanner;

public class Hw {

	static Scanner scanner = new Scanner(System.in);

	public static boolean checkNumInArray(int[] arr) {
		int num;

		System.out.println("Provide number");

		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Incorrect number");
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}


	public static int[] removeNumFromArray(int[] arr) {

		int num;

		System.out.println("Provide number to remove from array");

		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Incorrect number");
			return arr;
		}

		int newArr[] = new int [arr.length];

		for (int i = 0; i < arr.length; i++) {
			if(newArr[i] != num) {
				newArr[i] = arr[i];
			}
		}
		return newArr;
	}
}
