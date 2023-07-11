package lesson3.practice;

import support.Utilities;

public class Main {

	public static void main(String[] args) {

		int[][] arr = {{1, 2, 5}, {2, 5, 2}, {1, 2, 3}};

//		Find a sum of elements on the main diagonal
		System.out.println(Practice.sumOfDiagonalElements(arr));

//		Find max value
		int[] intsArr = {25, 47, 34, 34, 18, 96, 28, 55, 87, 13};
		System.out.println("Min value is: '" + Utilities.getMin(intsArr) + "'");
		System.out.println("Max value is: '" + Utilities.getMax(intsArr) + "'");

//		Array input by scanner
		Practice.createArrayByScanner();
	}
}