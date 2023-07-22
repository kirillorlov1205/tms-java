package lesson2_operations_conditionals_loops.classes;

import support.Utilities;

public class Hw {

//	Conditionals

	public static void getSeasonByMonthIf(int monthNum) {
		System.out.println("Get season by month with if");
		if (monthNum == 12 || monthNum <= 2) {
			System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.WINTER);
		} else if (monthNum >= 3 && monthNum <= 5) {
			System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.SPRING);
		} else if (monthNum >= 6 && monthNum <= 8) {
			System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.SUMMER);
		} else if (monthNum >= 9 || monthNum <= 1) {
			System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.AUTUMN);
		} else {
			System.out.println("There is no month with number: " + monthNum);
		}

	}

	public static void getSeasonByMonthSwitch(int monthNum) {
		System.out.println("Get season by month with switch");
		switch (monthNum) {
			case 12:
			case 1:
			case 2:
				System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.WINTER);
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.SPRING);
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.SUMMER);
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Month with number '" + monthNum + "' is in season: " + Enums.Seasons.AUTUMN);
				break;
			default:
				System.out.println("There is no month with number: " + monthNum);
				break;
		}
	}

	public static void isEven(int num) {
		System.out.println("Check even");
		System.out.println(num % 2 == 0);
	}

	public static void getWeatherByTempreture(int t) {
		System.out.println("Weather by tempreture");
		if (t > -5) {
			System.out.println("Warm");
		} else if (t > -20) {
			System.out.println("Good");
		} else {
			System.out.println("Cold");
		}
	}

	public static void getRainbowColorByNumber(int num) {
		System.out.println("Rainbow colors by number");
		switch (num) {
			case 1:
				System.out.println("Color with number '" + num + "' is = " + Enums.Colors.RED);
				break;
			case 2:
				System.out.println("Color with number '" + num + "' is = " + Enums.Colors.ORANGE);
				break;
			case 3:
				System.out.println("Color with number '" + num + "' is = " + Enums.Colors.YELLOW);
				break;
			case 4:
				System.out.println("Color with number '" + num + "' is = " + Enums.Colors.GREEN);
				break;
			case 5:
				System.out.println("Color with number '" + num + "' is = " + Enums.Colors.LIGHT_BLUE);
				break;
			case 6:
				System.out.println("Color with number '" + num + "' is = " + Enums.Colors.BLUE);
				break;
			case 7:
				System.out.println("Color with number '" + num + "' is = " + Enums.Colors.PURPLE);
				break;
			default:
				System.out.println("Please select color form 1 to 7");
				break;
		}
	}

//	Loops

	public static void getOddNumbers() {
		System.out.println("Odd numbers");
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void getNumbersInDesc() {
		System.out.println("Numbers in desc");
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void getNumbersSum() {
		System.out.println("Numbers sum");
		int sum = 0;
		System.out.println("Provide number");
		int num = Utilities.getConsoleNumber();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void getAddSevenRaw() {
		System.out.println("Raw of numbers increased by seven");
		int num = 7;
		while (num <= 98) {
			System.out.print(num + " ");
			num += 7;
		}
		System.out.println();
	}

	public static void getFiveNumbersRaw() {
		System.out.println("Five numbers raw");
		int num = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(num + " ");
			num -= 5;
		}
		System.out.println();
	}

	public static void getSquaredNumbers() {
		System.out.println("Squared numbers");
		for (int i = 10; i <= 20; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
	}

	public static void fibonacci() {
		System.out.println("Fibonacci");
		int count = 11;
		int a = 1;
		int b = 2;
		int c;

		for (int i = 0; i < count; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}

	public static void deposit(double deposit, int monthsQuantity) {
		System.out.println("Deposit");
		double sum = 0;
		double percentAmount;
		for (int i = 1; i <= monthsQuantity; i++) {
			percentAmount = (deposit + sum) * (7.0 / 100);
			sum += percentAmount;
		}
		System.out.println("Sum after " + monthsQuantity + " months will be = " + sum);
	}

	public static void getMultiplicationTable() {
		System.out.println("Multiplication Table");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("(" + i + " * " + j + ") = " + i * j);
			}
			System.out.println();
		}
	}

	public static void getPythagorasTable() {
		System.out.println("Pythagoras table");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
	}
}