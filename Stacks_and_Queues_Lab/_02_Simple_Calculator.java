package Stacks_and_Queues_Lab;

import java.util.*;

public class _02_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] expressionPartsList = expression.split(" ");

        List<String> partsList = Arrays.asList(expressionPartsList);
        Collections.reverse(partsList);

        for (String part : partsList) {
            stack.push(part);
        }
        System.out.println();

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());

            int result = 0;
            switch (operator) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                default:
                    System.out.println("Unknown operation" + operator);
                    return;
            }
            stack.push("" + result);
        }
        System.out.println(stack.pop());
    }
}
