package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _07_Find_The_Real_Queen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];
        for (int row = 0; row < matrix.length; row++) {

            String[] character = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row] = character;
            }
        }
        String firstDiagonal = "";
        for (int i = 0; i < matrix.length; i++) {
            firstDiagonal = firstDiagonal + matrix[i][i];
        }

        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("q")) {
                    System.out.println(row + " " + col);
                }
            }
        }

    }
}