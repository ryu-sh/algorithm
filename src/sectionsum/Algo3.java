package sectionsum;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11659
public class Algo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sumSize = scanner.nextInt();
        int[] array = new int[size + 1];
        int[] sectionSumArray = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            array[i] = scanner.nextInt();
            sectionSumArray[i] = sectionSumArray[i - 1] + array[i];
        }

        for (int i = 0; i < sumSize; i++) {
            int firstIndex = scanner.nextInt() - 1;
            int lastIndex = scanner.nextInt();
            System.out.println(sectionSumArray[lastIndex] - sectionSumArray[firstIndex]);
        }
    }
}
