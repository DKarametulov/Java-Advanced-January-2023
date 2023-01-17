package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _03_Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {
            String[] parts = scanner.nextLine().split(" ");

            for (int col = 0; col < firstMatrix[0].length; col++) {
                firstMatrix[row][col] = parts[col].charAt(0);
            }
        }
        for (int row = 0; row < secondMatrix.length; row++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int col = 0; col < secondMatrix[row].length; col++) {
                secondMatrix[row][col] = parts[col].charAt(0);

            }
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            System.out.println();
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.print("* ");
                } else {
                    System.out.print(firstMatrix[row][col] + " ");
                }
            }
        }
    }
}