package sectionsum;

import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] sectionSum = new int[11];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            sectionSum[i] = sectionSum[i-1] + scanner.nextInt();
        }

        int diff = Integer.MAX_VALUE;
        int result = 0;
        for (int sum : sectionSum) {
            int newDiff = Math.abs(100 - sum);
            if (newDiff <= diff) {
                result = sum;
                diff = newDiff;
            }
        }
        System.out.println(result);
    }
}
