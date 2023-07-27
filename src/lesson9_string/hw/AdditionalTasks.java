package lesson9_string.hw;

import lesson9_string.hw.Exceptions.WrongChoiceProvidedException;

import java.util.Scanner;

public class AdditionalTasks {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String SEPARATOR = " ";

    public static void findWordWithMinUniqueSymbols() {
        System.out.println("Provide words");
        String str = SCANNER.nextLine();

        String[] arr = str.split(SEPARATOR);

        String wordWithMinimalUniqueSymbols = "";

        if (arr.length == 0) {
            System.out.println("There are no words provided");
            return;
        } else if (arr.length == 1) {
            System.out.println("Result: '" + arr[0] + "unique symbols: '" + calculateUniqueSymbols(arr[0]) + "'");
        }

        for (String word : arr) {
            if (calculateUniqueSymbols(word) < calculateUniqueSymbols(wordWithMinimalUniqueSymbols)) {
                wordWithMinimalUniqueSymbols = word;
            }
        }

        System.out.println("Word: '" + wordWithMinimalUniqueSymbols + "' has minimal unique symbols: '"
                + calculateUniqueSymbols(wordWithMinimalUniqueSymbols) + "'");

    }

    public static int calculateUniqueSymbols(String str) {

        char[] uniqueSymbols = new char[str.length()];
        int uniqueSymbolsCounter = 1;
        uniqueSymbols[0] = str.charAt(0);

        for (char symbol : str.substring(1).toCharArray()) {

            boolean unique = true;

            for (int i = 0; i < uniqueSymbolsCounter; i++) {

                if (symbol == uniqueSymbols[i]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqueSymbols[uniqueSymbolsCounter] = symbol;
                uniqueSymbolsCounter++;
            }
        }
        return uniqueSymbolsCounter;
    }

    public static void findPalindrome() throws WrongChoiceProvidedException {
        System.out.println("Provide words");
        String str = SCANNER.nextLine();

        String[] strArr = str.split(" ");

        int index = 1;

        System.out.println("Select a word from a list to check for palindrome");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println((index++) + ". " + strArr[i]);
        }

        int choice = SCANNER.nextInt();

        if (choice > strArr.length) {
            throw new WrongChoiceProvidedException("Are you stupid? There is no word with num: '" + choice + "'");
        }

        System.out.println(isPalindrome(strArr[--choice]));
    }

    public static boolean isPalindrome(String word) {

        StringBuilder stringBuilder = new StringBuilder(word).reverse();

        return word.contentEquals(stringBuilder);
    }

    public static String getStrWithDoubledSymbols() {
        System.out.println("Provide a word");
        String word = SCANNER.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        for (char el : word.toCharArray()) {
            stringBuilder.append(el);
            stringBuilder.append(el);
        }

        return stringBuilder.toString();
    }
}
