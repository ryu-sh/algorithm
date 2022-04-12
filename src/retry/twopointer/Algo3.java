package retry.twopointer;

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
        int result = 0;
        for (int i = 0; i < consecutive; i++) {
            result += array1[i];
        }
        int left = 1;
        int right = consecutive;
        int temp = result;
        while (right < array1.length) {
            temp -= array1[left - 1];
            temp += array1[right];
            result = Math.max(result, temp);
            left++;
            right++;
        }
        return result;
    }
}
