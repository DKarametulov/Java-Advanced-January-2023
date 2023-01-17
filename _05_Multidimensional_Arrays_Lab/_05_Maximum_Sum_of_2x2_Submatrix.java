package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _05_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] table = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] columnData = scanner.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                table[row][col] = Integer.parseInt(columnData[col]);
            }
        }

        int maxSumTopLeftRow = -1;
        int maxSumTopLeftCol = -1;

        // FIXME: Is 0 a good enough starting value?
        int maxSum = 0;
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table[i].length - 1; j++) {
                int currentSum = table[i][j] + table[i][j + 1]
                        + table[i + 1][j] + table[i + 1][j + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    maxSumTopLeftRow = i;
                    maxSumTopLeftCol = j;
                }
            }
        }

        System.out.println(table[maxSumTopLeftRow][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(table[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);
    }
}
