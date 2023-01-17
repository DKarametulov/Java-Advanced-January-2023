package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _01_Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");

        int firstRows = Integer.parseInt(dimensions[0]);
        int firstCols = Integer.parseInt(dimensions[1]);

        int[][] firstMatrix = new int[firstRows][firstCols];

        for (int i = 0; i < firstRows; i++) {
            String[] parts = scanner.nextLine().split(" ");

            for (int j = 0; j < firstCols; j++) {
                firstMatrix[i][j] = Integer.parseInt(parts[j]);

            }

        }
        dimensions = scanner.nextLine().split(" ");
        int secondRows = Integer.parseInt(dimensions[0]);
        int secondCols = Integer.parseInt(dimensions[1]);
        int[][] secondMatrix = new int[secondRows][secondCols];

        for (int i = 0; i < secondRows; i++) {
            String[] parts = scanner.nextLine().split(" ");

            for (int j = 0; j < secondCols; j++) {
                secondMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }
        boolean areEqual = true;

        if (firstRows != secondRows || firstCols != secondCols) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstRows; i++) {
                for (int j = 0; j < firstCols; j++) {
                    if (firstMatrix[i][j] != secondMatrix[i][j]) {
                        areEqual = false;
                    }
                }
            }
        }
        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

