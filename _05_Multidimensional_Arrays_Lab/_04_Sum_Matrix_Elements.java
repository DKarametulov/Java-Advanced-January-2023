package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _04_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");


        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int[][] data = new int[rows][cols];

        for (int i = 0; i < data.length ; i++) {
            String[] columnData = scanner.nextLine().split(", ");

            for (int j = 0; j < data[i].length; j++) {
           data[i][j] = Integer.parseInt(columnData[j]);


            }

        }
        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length ; j++) {
                sum += data[i][j];

            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

}
