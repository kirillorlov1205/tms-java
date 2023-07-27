package lesson9_string.practice;

import java.util.Scanner;

public class Functions {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String SEPARATOR = " ";

    public static void findMinAndMaxStr() {

        System.out.println("Provide words");
        String str = SCANNER.nextLine();
        String[] arr = str.split(SEPARATOR);

        String min = arr[0];
        String max = arr[0];

        for (String string : arr) {
            if (string.length() < min.length()) {
                min = string;
            } else if (string.length() > max.length()) {
                max = string;
            }
        }
        System.out.println(new StringBuilder().append("min: '").append(min).append("' has length: ").append(min.length()));
        System.out.println(new StringBuilder().append("max: '").append(max).append("' has length: ").append(max.length()));
    }

    public static void getStrWithMoreThenAverageLength() {

        System.out.println("Provide words");
        String str = SCANNER.nextLine();
        String[] arr = str.split(SEPARATOR);

        int sumSymbols = 0;

        for (String element : arr) {
            sumSymbols += element.length();
        }

        int averageLength = sumSymbols / arr.length;
        System.out.println("Average length is: '" + averageLength + "'");

        for (String element : arr) {
            if (element.length() > averageLength) {
                System.out.println(new StringBuilder("word: '").append(element).append("' has '").append(element.length()).append("' symbols"));
            }
        }

    }

    public static void getThreeFormattedStrings() {
        System.out.println("Provide first sentence");
        String str1 = SCANNER.nextLine();
        System.out.println("Provide second sentence");
        String str2 = SCANNER.nextLine();
        System.out.println("Provide third sentence");
        String str3 = SCANNER.nextLine();

        System.out.println(
                new StringBuilder("str3 without changes: '")
                        .append(str3).append("'\n")
                        .append("str2 in Uppercase: '").append(str2.toUpperCase()).append("'\n")
                        .append("str1 in Lowercase: '").append(str2.toLowerCase()).append("'")
        );
    }
}
