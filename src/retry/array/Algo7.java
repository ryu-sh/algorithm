package retry.array;

import java.util.Scanner;

public class Algo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println(solution(numbers));
    }

    private static int solution(int[] scores) {
        int sequenceScore = 0;
        int totalScore = 0;

        for (int score : scores) {
            if (score == 1) {
                sequenceScore ++;
                totalScore += sequenceScore;
            }
            else {
                sequenceScore = 0;
            }
        }
        return totalScore;
    }
}
