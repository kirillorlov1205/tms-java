package lesson9_string;

import lesson9_string.hw.AdditionalTasks;
import lesson9_string.hw.Exceptions.WrongChoiceProvidedException;
import lesson9_string.hw.MainTask;
import lesson9_string.practice.Functions;

public class Main {

    public static void main(String[] args) {

//------PRACTICE

//    Practice task1 min and max string
        Functions.findMinAndMaxStr();

//    Practice task2 get str with more than average length
        Functions.getStrWithMoreThenAverageLength();

//    Practice task3 get str with more than average length
        Functions.getThreeFormattedStrings();


//------HW MAIN TASK

//      HW task1
        MainTask.formatDocument("5551-Abc-5252-FTO-1a2b");

//      HW task1 Additional task1 find Minimal Different Symbols
        AdditionalTasks.findWordWithMinUniqueSymbols();

//      HW task2 Palindrome
        try {
            AdditionalTasks.findPalindrome();
        } catch (WrongChoiceProvidedException e) {
            System.out.println(e.getMessage());
        }

//      HW task3 double symbols in string
        System.out.println(AdditionalTasks.getStrWithDoubledSymbols());
    }
}
