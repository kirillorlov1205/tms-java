package lesson1.collegeSystem;

import support.Utilities;

import java.util.Scanner;

public class Journal {

    private static Student[] journal;

    public static void menu() {
        int choice;

        do {
            System.out.println("Choose action\n" +
                    "1. Просмотр студентов\n" +
                    "2. Генерация оценок (от 1 до 10).\n" +
                    "3. Просмотр лучшего студента (максимальная оценка).\n" +
                    "4. Выход");

            choice = Utilities.getConsoleNumber();

            switch (choice) {
                case 1:
                    System.out.println("List of students:\n");
                    showStudentsList();
                    break;
                case 2:
                    generateMarks();
                    System.out.println("Marks have been generated\n");
                    break;
                case 3:
                    System.out.println("The best mark is: " + getBestMark() + "\n");
                    break;
                case 4:
                    System.out.println("Good day!");
                    break;
                default:
                    System.out.println("Unknown action\n");
            }
        } while (choice != 4);
    }

    public static void createStudentsList() {
        int index = 1;

        System.out.println("Provide students quantity");
        int studentQuantity = Utilities.getConsoleNumber();
        journal = new Student[studentQuantity];



        for (int i = 0; i < journal.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя студента " + index++);
            String name = scanner.nextLine();
            journal[i] = new Student(name);
        }
    }

    public static void showStudentsList() {
        for (int i = 0; i < journal.length; i++) {
            System.out.println(journal[i]);
        }
    }

    public static void generateMarks() {
        for (int i = 0; i < journal.length; i++) {
            journal[i].setMark(getRandomNumber(0, 10));
        }
    }

    public static float getBestMark() {
        float bestMark = 0;
        for (int i = 0; i < journal.length; i++) {
            if (journal[i].getMark() > bestMark) {
                bestMark = journal[i].getMark();
            }
        }
        return bestMark;
    }

    public static float getRandomNumber(int min, int max) {
        return (float) ((Math.random() * (max - min)) + min);
    }

}