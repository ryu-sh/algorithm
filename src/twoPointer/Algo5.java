package twoPointer;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(solution(number));
    }

    private static int solution(int targetNumber) {
        int maxNumber = targetNumber / 2 + 1;
        int rightPointer = 0;
        int leftPointer = 0;
        int tempSum = 0;
        int answer = 0;

        while (rightPointer <= maxNumber) {
            tempSum += rightPointer++;

            while (tempSum > targetNumber) {
                tempSum -= leftPointer++;
            }

            if (tempSum == targetNumber) {
                answer ++;
            }
        }

        return answer;
    }
}
