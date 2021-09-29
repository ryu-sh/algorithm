package dp;

import java.util.Scanner;

public class Algo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int[] array1 = new int[number1];

        for (int i = 0; i < number1; i++) {
            array1[i] = in.nextInt();
        }
        System.out.println(solution(number1, array1));
    }

    private static int solution(int number1, int[] array1) {
        int[] dy = new int[number1+1];
        int answer = 1;
        dy[0] = 1;

        for (int i = 1; i< array1.length; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (array1[i] > array1[j] && dy[j] > max) {
                    dy[i] = dy[j] + 1;
                    max = dy[j];
                }
            }
            if (max == 0) {
                dy[i] = 1;
            }
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}
