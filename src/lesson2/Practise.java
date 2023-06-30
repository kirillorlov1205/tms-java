package lesson2;

public class Practise {

	public static void task1() {
		for (int i = 1; i <= 10; i++) {
			switch (i) {
				case 1:
					System.out.println("один");
					break;
				case 2:
					System.out.println("два");
					break;
				case 3:
					System.out.println("три");
					break;
				case 4:
					System.out.println("четыре");
					break;
				case 5:
					System.out.println("пять");
					break;
				case 6:
					System.out.println("шесть");
					break;
				case 7:
					System.out.println("семь");
					break;
				case 8:
					System.out.println("восемь");
					break;
				case 9:
					System.out.println("девять");
					break;
				case 10:
					System.out.println("десять");
					break;
				default:
					System.out.println("done");
					break;
			}
		}
	}

	public static void task2() {
		int i = 10;
		int sum = 0;
		while (i <= 55) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("Sum of even numbers: " + sum);
	}

	public static void task3(int monthNum) {

		if (monthNum == 12 || monthNum <= 2) {
			System.out.println("Season is: " + Enums.Seasons.WINTER);
		} else if (monthNum >= 3 && monthNum <= 6 ) {
			System.out.println("Season is: " + Enums.Seasons.SPRING);
		}

		}
	}