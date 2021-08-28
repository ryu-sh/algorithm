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
        int max = 0;

        for (int i = 0; i < array1.length-consecutive; i++) {
            int temp = 0;
            // 미리 계산하고 하나씩 빼고 더하고 하면서 구해야 한다.
//            for (int j = 0; j < consecutive; j++) {
//                temp += array1[i+j];
//            }
            if (max < temp) {
                max = temp;
            }
        }

        return max;
    }
}
