package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);

            }
        }

        int search = Integer.parseInt(scanner.nextLine());

        boolean isFaund = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search) {
                    isFaund = true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if (!isFaund){
            System.out.println("not found");
        }
    }
}