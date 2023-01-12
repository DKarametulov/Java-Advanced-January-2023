package Stacks_and_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _01_Browser_History {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")){
            if (currentInput.equals("back")) {
                if (history.size() == 1 || history.isEmpty()){
                    System.out.println("no previous URLs");

                    currentInput = scanner.nextLine();

                    continue;
                }
                history.pop();

            }else {
                history.push(currentInput);
            }
            System.out.println(history.peek());

            currentInput = scanner.nextLine();


        }
    }
}
