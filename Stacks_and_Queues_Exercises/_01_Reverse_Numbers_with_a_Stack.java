package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _01_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] currentNum = input.split(" ");

        ArrayDeque<String> deck = new ArrayDeque<>();

        for (int i = 0; i <= currentNum.length - 1; i++) {

            deck.push(currentNum[i]);

        }
        for (String item : deck) {
            System.out.print(item + " ");
        }
    }
}
