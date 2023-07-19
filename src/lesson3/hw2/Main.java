package lesson3.hw2;

public class Main {

	public static void main(String[] args) {

		int arrWithInt[] = {1, 2, 3, 4, 5, 4, 9, 4};

//		Hw2 task0 array with 3 levels
		Functions.get3DArray();

//		Hw2 task1
		Functions.getCheeseBoard();

//	Additional tasks
//		Hw2 task3 Get sum of 2d array
		System.out.println(Functions.sumOf2DArray());

//		Hw2 task4 Get diagonals
		Functions.getDiagonals();

//		Hw2 task5 Get sorted by chars string 2d array
		Functions.getSortedString2DArray();
	}
}