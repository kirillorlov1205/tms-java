package lesson3.hw1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int arrWithInt[] = {1, 2, 3, 4, 5, 4, 9, 4};

//		Hw task0 Check number in array
		System.out.println(Functions.checkNumInArray(arrWithInt));

//		Hw task1 Remove number from array
		System.out.println(Arrays.toString(Functions.getArrayWithoutSelectedNumber(arrWithInt)));

//		Hw task2 Get min middle max values of random array
		Functions.getBoundaryValuesOfArray();

//		Hw task3 Compare two arrays
		Functions.getArraysComparison();

//		Hw task4 Get array with even numbers
		Functions.getArrayWithEvenNumbers();

//		Hw task5 Get array with odd index
		Functions.getArrayWithOddIndex();

//		Hw task6 Get array with names
		Functions.getArrayWithNames();

//	  	Hw.task7 Sorting
		Functions.sortArrayBubble(arrWithInt);
		System.out.println(Arrays.toString(arrWithInt));

		Functions.insertionSort(arrWithInt);
		System.out.println(Arrays.toString(arrWithInt));
	}
}