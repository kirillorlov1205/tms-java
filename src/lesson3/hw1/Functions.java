package lesson3.hw1;

import lesson3.Utilities;
import java.util.Arrays;

public class Functions {

	public static boolean checkNumInArray(int[] arr) {
		System.out.println("Provide number to find");
		int num = Utilities.getConsoleNumber();

		for (int i : arr) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}

	public static int[] getArrayWithoutSelectedNumber(int[] arr) {
		System.out.println("Provide number");
		int num = Utilities.getConsoleNumber();

		int numQuantity = 0;

		for (int element : arr) {
			if (element == num) {
				numQuantity++;
			}
		}

		int[] newArr = new int[arr.length - numQuantity];

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				newArr[index++] = arr[i];
			}
		}
		return newArr;
	}

	public static void getBoundaryValuesOfArray() {
		System.out.println("Provide array size");
		int num = Utilities.getConsoleNumber();
		int arr[] = new int[num];
		Utilities.fillArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Max value in the array: '" + Utilities.getMax(arr) + "'");
		System.out.println("Min value in the array: '" + Utilities.getMin(arr) + "'");
		System.out.println("Average value in the array: '" + getAverage(arr) + "'");
	}

	private static int getAverage(int[] arr) {
		int sum = 0;
		for (int element : arr) {
			sum += element;
		}
		return sum / arr.length;
	}

	public static void getArraysComparison() {
		int[] arr1 = {1, 2, 3, 4, 34};
		int[] arr2 = {1, 2, 3, 100, 2};

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		if (getAverage(arr1) > getAverage(arr2)) {
			System.out.println("Average value of the first array is bigger");
		} else if (getAverage(arr1) < getAverage(arr2)) {
			System.out.println("Average value of the second array is bigger");
		} else {
			System.out.println("Average values of arrays are equal");
		}

	}

	public static void getArrayWithEvenNumbers() {

		int[] arr = new int[0];
		int num;

		do {
			System.out.println("Provide number");
			num = Utilities.getConsoleNumber();
			if (num > 5 && num <= 10) {
				arr = new int[num];
			} else {
				System.out.println("Please provide number again\n" +
						"Array size should be bigger than 5 and less than 11");
			}
		} while (num <= 5 || num > 10);

		Utilities.fillArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(getArrayWithEvenNumbers(arr)));
	}

	public static int[] getArrayWithEvenNumbers(int[] arr) {
		int evenNumbersQuantity = 0;

		for (int element : arr) {
			if (element % 2 == 0 && element != 0) {
				evenNumbersQuantity++;
			}
		}

		int[] newArr = new int[evenNumbersQuantity];

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] != 0) {
				newArr[index++] = arr[i];
			}
		}
		return newArr;
	}

	public static void getArrayWithOddIndex() {

		int[] arr = new int[10];
		Utilities.fillArray(arr);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void sortArrayBubble(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;
				}
			}
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > current) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = current;
		}
	}

	public static void getArrayWithNames() {
		String [] namesArr = {"Kirill", "Citoria", "Boris","Avan"};
		Arrays.sort(namesArr);
		System.out.println(Arrays.toString(namesArr));
	}
}