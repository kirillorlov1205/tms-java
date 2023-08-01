package lesson9_string.hw;

public class MainTask {

    public static void formatDocument(String documentName) {

        System.out.println("Вывести на экран в одну строку два первых блока по 4 цифры. \n" +
                getDigitsBlocks(documentName));

        System.out.println("Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *) \n" +
                changeThreeSymbols(documentName));

        System.out.println("Вывести на экран буквы из номера документа в формате Letters: yyy/yyy/y/y\" в верхнем регистре(реализовать с помощью " +
                "класса StringBuilder).\n" +
                getLettersFromDocument(documentName));

        System.out.println("Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.\n" +
                getNumbersFromDocument(documentName));

        System.out.println("Проверить содержит ли номер документа последовательность abc и\n" +
                "вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью)\n" +
                hasAbc(documentName));

        System.out.println("Проверить начинается ли номер документа с последовательности 555\n" +
                startWith555(documentName));

        System.out.println("Проверить заканчивается ли номер документа на последовательность 1a2b\n" +
                endsWIth1a2b(documentName));
    }

    private static String getDigitsBlocks(String documentName) {
        String[] arr = documentName.split("-");

        String firstDigitsBlock = arr[0];
        String secondDigitsBlock = arr[2];

        System.out.println();
        return "First block: '" + firstDigitsBlock + "', Second block: '" + secondDigitsBlock + "'";
    }

    private static boolean endsWIth1a2b(String documentName) {
        System.out.println();
        return documentName.endsWith("1a2b");
    }

    private static boolean startWith555(String documentName) {
        System.out.println();
        return documentName.startsWith("555");
    }

    public static String changeThreeSymbols(String documentName) {
        String[] arr = documentName.split("-");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() == 3) {
                stringBuilder.append("-***-");
            } else {
                stringBuilder.append(arr[i]);
            }

        }
        System.out.println();
        return stringBuilder.toString();
    }

    public static String getNumbersFromDocument(String documentName) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArr = documentName.toCharArray();

        for (int i = 0; i < charArr.length; i++) {

            if (charArr[i] != '-' && Character.isDigit(charArr[i])){
                stringBuilder.append(charArr[i]);
            }
            if (stringBuilder.length() == 3 || stringBuilder.length() == 7 || stringBuilder.length() == 9 ) {
                stringBuilder.append("/");
            }
            if (stringBuilder.length() == 11 ){
                break;
            }
        }
        System.out.println();
        return stringBuilder.toString().toLowerCase();
    }

    public static String getLettersFromDocument(String documentName) {
        StringBuilder stringBuilder = new StringBuilder("Letters: ");

        char[] charArr = documentName.toCharArray();

        for (int i = 0; i < charArr.length; i++) {

            if (charArr[i] != '-' && Character.isLetter(charArr[i])){
                stringBuilder.append(charArr[i]).toString().toUpperCase();
            }
            if (stringBuilder.length() == 12 || stringBuilder.length() == 16 || stringBuilder.length() == 18 ) {
                stringBuilder.append("/");
            }
        }
        System.out.println();
        return stringBuilder.toString();
    }

    public static boolean hasAbc(String documentName) {
        String [] strArr = documentName.split("-");
        boolean containsAbs = false;

        for(String element : strArr) {
            if (element.equalsIgnoreCase("ABC")) {
                containsAbs = true;
                break;
            }
        }
        System.out.println();
        return containsAbs;
    }
}
