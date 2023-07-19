package lesson1;

import lesson1.classes.Hello;
import lesson1.collegeSystem.Journal;

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