package lesson1_setup_hello;

import lesson1_setup_hello.classes.Hello;
import lesson1_setup_hello.collegeSystem.Journal;

public class Main {

	public static void main(String[] args) {
//		Hello
		Hello.showHello();
		Hello.showHelloToUser();

//		Students
		Journal.createStudentsList();
		Journal.menu();
	}
}