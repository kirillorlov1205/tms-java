package lesson1.classes;

import java.util.Scanner;

public class Hello {

	public static void showHello() {
		System.out.println("Hello World");
	}

	public static void showHelloToUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String userName = scanner.next();
		System.out.println("Hello " + userName);
	}

}