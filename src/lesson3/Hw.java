package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hw {

	static Scanner scanner = new Scanner(System.in);

	public static boolean checkNumInArray(int[] arr) {
		int num = getConsoleNumber();

		for (int i : arr) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}

	public static int[] getArrayWithoutSelectedNumber(int[] arr) {

		int num = getConsoleNumber();

		int numQuantity = 0;

		for (int element: arr) {
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
		int num = getConsoleNumber();
		int arr[] = new int[num];
		fillArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Max value in the array: '" + getMax(arr) + "'");
		System.out.println("Min value in the array: '" + getMin(arr) + "'");
		System.out.println("Average value in the array: '" + getAverage(arr) + "'");
	}

	private static int getMin(int[] arr) {
		int min = arr[0];
		for (int element : arr) {
			if (min > element) {
				min = element;
			}
		}
		return min;
	}

	private static int getMax(int[] arr) {
		int max = arr[0];
		for (int element : arr) {
			if (max < element) {
				max = element;
			}
		}
		return max;
	}

	private static int getAverage(int[] arr) {
		int sum = 0;
		for (int element : arr) {
			sum += element;
		}
		return sum / arr.length;
	}

	private static void fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
	}

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
			num = getConsoleNumber();
			if (num > 5 && num <= 10) {
				arr = new int[num];
			} else {
				System.out.println("Please provide number again\n" +
						"Array size should be bigger than 5 and less than 11");
			}
		} while (num <= 5 || num > 10);

		fillArray(arr);
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

		int [] arr = new int[10];
		fillArray(arr);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void sortArray() {

	}

//	public static void getArrayWithNames() {
//		String [] namesArr = {"Kirill", "Citoria", "Boris","Avan"};
//		Arrays.sort(namesArr);
//		System.out.println(Arrays.toString(namesArr));
//	}





}

