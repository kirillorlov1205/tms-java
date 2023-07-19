package lesson4;

import java.util.Scanner;
import java.util.UUID;

public class Utilities {
    static Scanner scanner = new Scanner(System.in);

    public static int getRandomMark() {
        return (int) (Math.random() * 10 + 1);
    }

    public static String fillWithRandomString(){
        UUID randomUUID = UUID.randomUUID();
        System.out.println();
        return randomUUID.toString().replaceAll("_", "");
    }

    public static int getConsoleNumber() {
        int num = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Incorrect number, your number will be '0'");
        }
        return num;
    }

    public static String getConsoleString() {
        String str = "";
        if (scanner.hasNextLine()) {
            str = scanner.next();
        } else {
            System.out.println("Please provide valid string");
        }
        return str;
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int element : arr) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }
}