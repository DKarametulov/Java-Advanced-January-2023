package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();
        boolean isBalanced = true;

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);
            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                openBrackets.push(currentBracket);
            } else {
                if (openBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char lastOpenBrackets = openBrackets.pop();
                if (currentBracket == '}' && lastOpenBrackets != '{') {
                    isBalanced = false;
                    break;
                } else if (currentBracket == ']' && lastOpenBrackets != '[') {
                    isBalanced = false;
                    break;
                } else if (currentBracket == ')' && lastOpenBrackets != '(') {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
