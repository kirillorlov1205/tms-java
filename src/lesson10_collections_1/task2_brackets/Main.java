package lesson10_collections_1.task2_brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        String expr = "{[()]}";

        if (checkBrackets(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    static boolean checkBrackets(String str) {
        Deque<Character> deq = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                deq.push(x);
                continue;
            }

            if (deq.isEmpty())
                return false;

            char check;
            switch (x) {
                case ')' -> {
                    check = deq.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                }
                case '}' -> {
                    check = deq.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                }
                case ']' -> {
                    check = deq.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                }
            }
        }
        return (deq.isEmpty());
    }
}
