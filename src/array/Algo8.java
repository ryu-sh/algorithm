package array;

import java.util.Scanner;

public class Algo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = in.nextInt();
        }

        int[] ranks = solution(array);

        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }

    private static int[] solution(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int rank = 1;

            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    rank ++;
                }
            }
            result[i] = rank;
        }

        return result;
    }
}
