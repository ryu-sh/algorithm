package sectionsum;

import java.util.Scanner;

public class Algo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int slidingSize = scanner.nextInt();
        int temp = 0;
        int tempSum = 0;
        int result = Integer.MIN_VALUE;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (temp == slidingSize) {
                tempSum = tempSum + array[i] - array[i - slidingSize];
                result = Math.max(result, tempSum);
            }
            if (slidingSize > temp) {
                tempSum += array[i];
                temp++;
            }
        }
        System.out.println(result);
    }
}
