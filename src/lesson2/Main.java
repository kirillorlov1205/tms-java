package lesson2;

public class Main {

	public static void main(String[] args) {

//Conditionals

//		Practise task 1
		Practise.task1();

//		Practise task 2
		Practise.task2();

//		Hw task1 get season
		Hw.getSeasonByMonthSwitch(5);

//		Hw task2 get season
		Hw.getSeasonByMonthIf(12);

//		Hw task3 is even
		Hw.isEven(10);

//		Hw task4 get Weather By Tempreture
		Hw.getWeatherByTempreture(-5);

//		Hw task5 get Rainbow color By number
		Hw.getRainbowColorByNumber(5);

//Loops

//		Hw task1 get Odd Numbers
		Hw.getOddNumbers();

//		Hw task2 get Odd Numbers
		Hw.getNumbersInDesc();

//		Hw task3 get Sum Of Numbers
//		Hw.getNumbersSum();

//		Hw task4 get raw of numbers increased by seven
		Hw.getAddSevenRaw();

//		Hw task5
		Hw.getFiveNumbersRaw();

//		Hw task6 get Square
		Hw.getSquaredNumbers();

//Additional tasks

//		task 1 Fibonacci
		System.out.println("Fibonacci");
		Hw.fibonacci();

//		task2 Bank
		System.out.println("Bank");

		Hw.deposit(10);


//		task3 Multiplication Table
		System.out.println("Multiplication Table");
		Hw.getMultiplicationTable();
		Hw.getPythagorasTable();
	}
}