package lesson3.hw2;

import lesson3.Utilities;

import java.util.Arrays;

public class Functions {

	public static void get3DArray() {
		int[][][] arr = {{{1, 2, 3}, {1, 2, 3}}, {{1, 2, 3}, {1, 2, 3}}};

		int num = Utilities.getConsoleNumber();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] += num;
					System.out.print(arr[i][j][k] + " ");
				}
			}
		}
		System.out.println();
	}

	public static void getCheeseBoard() {
		String[][] arr = new String[8][8];

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					if ((j % 2) == 0) {
						arr[i][j] = "W";
					} else {
						arr[i][j] = "B";
					}
				}
			}
			if (i % 2 != 0) {
				for (int j = 0; j < arr[i].length; j++) {
					if ((j % 2) == 0) {
						arr[i][j] = "B";
					} else {
						arr[i][j] = "W";
					}
				}
			}


		}

		for (String[] element : arr) {
			System.out.println(Arrays.toString(element));
		}
	}

	public static int sumOf2DArray() {
		int[][] arr = {{1, 2, 3}, {1, 23, 53, 54}};
		int sum = 0;

		for (int[] ints : arr) {
			for (int element : ints) {
				sum += element;
			}
		}
		return sum;
	}

	public static void getDiagonals() {
		int[][] arr = {{1, 2, 3}, {1,2,3}, {1,2,3}};

		for (int i = 0; i < arr.length ; i++) {
			for (int j = arr[i].length - 1; j > 0 ; j--) {
				System.out.println(arr[i][j]);
			}
		}
	}

	public static void getSortedString2DArray() {
		String [][] stringArr = {{"dcba","cdba"},{"bcda","adcb"}};

		for (int i = 0; i < stringArr.length; i++) {
			for (int j = 0; j < stringArr[i].length ; j++) {
				char[] charArray = stringArr[i][j].toCharArray();
				Arrays.sort(charArray);
				stringArr[i][j] = new String(charArray);
			}
		}
		for (String [] element : stringArr) {
			System.out.println(Arrays.toString(element));
		}
	}
}