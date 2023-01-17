package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _06_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int row = 0; row < size; row++) {
            int[] currentRow = new int[size];
            String[] columnData = scanner.nextLine().split(" ");

            for (int col = 0; col < columnData.length; col++) {
                currentRow[col] = Integer.parseInt(columnData[col]);
            }
            matrix[row] = currentRow;
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int row = size - 1, col = 0; col < size; row--, col++) {
            System.out.print(matrix[row][col] + " ");
        }

        for (int i = 0; i < size; i++) {
        }
    }
}
