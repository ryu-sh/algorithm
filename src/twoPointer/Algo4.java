package twoPointer;

import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int targetNumber = in.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(solution(array, targetNumber));
    }

    private static int solution(int[] array, int targetNumber) {
        int leftPointer = 0;
        int rightPointer = 1;
        int answer = 0;
        int tempSum = array[0];
        while (rightPointer < array.length) {
            tempSum += array[rightPointer++];

            while (tempSum > targetNumber) {
                tempSum -= array[leftPointer++];
            }

            if (tempSum == targetNumber) {
                answer ++;
            }
        }
        return answer;
    }
}
