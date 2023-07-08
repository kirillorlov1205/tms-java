package lesson3.practice;

import lesson3.Utilities;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static int sumOfDiagonalElements(int[][] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}

	public static void createArrayByScanner() {
		System.out.println("Provide array size");
		int arrSize = Utilities.getConsoleNumber();
		int[] arr = new int[arrSize];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Provide array element with index: '" + i + "'");
			arr[i] = Utilities.getConsoleNumber();
		}
		System.out.println("Array created:");
		System.out.println(Arrays.toString(arr));
	}


}