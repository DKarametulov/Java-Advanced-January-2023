package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _03_Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {

            String[] containCommands = scanner.nextLine().split(" ");
            String command = containCommands[0];



            switch (command) {
                case "1":

                    stack.push(Integer.parseInt(containCommands[1]));
                    break;
                case "2":
                        stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
