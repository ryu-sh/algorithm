package twoPointer;

import java.util.Scanner;

public class Algo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int consecutive = in.nextInt();

        int[] array1 = new int[number1];

        for (int i = 0; i < number1; i++) {
            array1[i] = in.nextInt();
        }

        System.out.println(solution(array1, consecutive));
    }

    private static int solution(int[] array1, int consecutive) {
        int temp = 0;
        for (int i = 0; i < consecutive; i++) {
            temp += array1[i];
        }
        int max = temp;
        for (int i = consecutive; i < array1.length; i++) {
            temp = temp - array1[i - consecutive] + array1[i];
            max = Math.max(temp, max);
        }

        return max;
    }
}
