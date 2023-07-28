package lesson5_classes.practise;

import support.Utilities;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//		Practise task 1
        Student[] students = new Student[14];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(Utilities.fillWithRandomString(), Utilities.fillWithRandomString(), Utilities.getRandomMark());
        }
        System.out.println(Arrays.toString(students));

//      Practise task 2
        Student[] listOfStudents = new Student[14];
        for (int i = 0; i < listOfStudents.length; i++) {
            listOfStudents[i] = new Student(Utilities.fillWithRandomString(), "A", Utilities.getRandomMark());
        }
        System.out.println(Arrays.toString(listOfStudents));

//      Practise task 3
        for (int i = 0; i < listOfStudents.length; i++) {
            if (listOfStudents[i].getDiplomaMark() >= 9)
                System.out.println(listOfStudents[i].getStudentData());
        }

//      Practise task 4
        Cat cat = new Cat("Murzik", 5);
        System.out.println(cat.feed(20));
        System.out.println(cat.feed(90));
    }
}