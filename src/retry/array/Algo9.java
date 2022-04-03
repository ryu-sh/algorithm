package retry.array;

import java.util.Scanner;

public class Algo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[][] array = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(array));
    }

    private static int solution(int[][] array) {
        int rowSum = rowSum(array);
        int colSum = colSum(array);
        int diagonalSum = diagonalSum(array);

        int tempMaxSum = Math.max(rowSum, colSum);

        return Math.max(tempMaxSum, diagonalSum);
    }

    private static int diagonalSum(int[][] array) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < array.length; i++) {
            leftSum += array[i][i];
            rightSum += array[i][array.length - 1 - i];
        }
        return Math.max(leftSum, rightSum);
    }

    private static int colSum(int[][] array) {
        int maxSum = 0;
        for (int i = 0; i < array[0].length; i++) {
            int tempSum = 0;
            for (int j = 0; j < array.length; j++) {
                tempSum += array[j][i];
            }
            Math.min(maxSum, tempSum);
        }
        return maxSum;
    }

    private static int rowSum(int[][] array) {
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                tempSum += array[i][j];
            }
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }
}
