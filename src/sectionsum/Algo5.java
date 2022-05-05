package sectionsum;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int[][] sum = new int[size+1][size+1];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + array[i][j];
            }
        }

    }
}
