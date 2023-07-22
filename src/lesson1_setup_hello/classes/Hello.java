package lesson1_setup_hello.classes;

import support.Utilities;

public class Hello {

	public static void showHello() {
		System.out.println("Hello World");
	}

	public static void showHelloToUser() {
		System.out.println("What's your name?");
		String userName = Utilities.getConsoleString();
		System.out.println("Hello " + userName);
	}
}