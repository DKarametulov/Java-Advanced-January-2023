package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _04_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(scanner.nextInt());

        }
        for (int i = 1; i <= s ; i++) {
            queue.poll();

        }if (queue.contains(x)){
            System.out.println("true");
        }else {
            if (queue.isEmpty()){
                System.out.println(0);
            }else
            System.out.println(Collections.min(queue));
        }
    }
}
