package Stacks_and_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> bits = new ArrayDeque<>();
        int num = Integer.parseInt(scanner.nextLine());

        if (num < 0) {
            System.out.println("Can not handle negative integers");
            return;
        }
        if (num == 0) {
            System.out.println(0);
            return;
        }
        while (num > 0) {
            int bit = num % 2;
            bits.push(String.valueOf(bit));
            num = num / 2;
        }
        while (!bits.isEmpty()) {
            System.out.print(bits.pop());
        }
    }
}
