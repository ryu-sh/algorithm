package array;

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

        int rowMaxSum = rowMaxSum(array);
//        int colMaxSum = colMaxSum(array);
        int diagonalSum = diagonalSum(array);

//        int result = Math.max(rowMaxSum,colMaxSum);

        return Math.max(rowMaxSum, diagonalSum);
    }

    private static int diagonalSum(int[][] array) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < array.length; i++) {
            leftDiagonalSum += array[i][i];
            rightDiagonalSum += array[i][array.length-1-i];
        }

//        for (int i = 0; i < array.length; i++) {
//            rightDiagonalSum += array[i][array.length-1-i];
//        }

        return Math.max(leftDiagonalSum, rightDiagonalSum);
    }

    private static int rowMaxSum(int[][] array) {
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                rowSum += array[i][j];
                colSum += array[j][i];
            }
            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);
        }

        return maxSum;
    }

    private static int colMaxSum(int[][] array) {
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            int colSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                colSum += array[j][i];
            }
            if (maxSum < colSum) {
                maxSum = colSum;
            }
        }

        return maxSum;
    }


}
