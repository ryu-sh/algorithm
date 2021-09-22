package twoPointer;

import java.util.Scanner;

public class Algo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int change = in.nextInt();
        int[] array = new int[range];
        for (int i = 0; i < range; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(solution(array, change));
    }

    private static int solution(int[] array, int change) {
        int max = 0;
        int tempChange = 0;
        int tempMax = 0;
        int rightPointer = 0;
        int leftPointer = 0;

        while (rightPointer < array.length) {
            tempMax ++;

            if (array[rightPointer] == 0) {
                tempChange ++;
            }

            while (change < tempChange) {
                if (array[leftPointer] == 0) {
                    tempChange --;
                }
                tempMax --;
                leftPointer ++;
            }

            max = Math.max(max, tempMax);
            rightPointer ++;
        }

        return max;
    }
}
