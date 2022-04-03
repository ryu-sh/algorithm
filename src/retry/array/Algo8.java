package retry.array;

import java.util.Scanner;

public class Algo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = in.nextInt();
        }
        int[] ranks = solution(numbers);

        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }

    private static int[] solution(int[] numbers) {
        int[] ranks = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int rank = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }
}
