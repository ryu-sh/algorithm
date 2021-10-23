package dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[][] array = new int[number][3];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(array));
    }

    private static int solution(int[][] array) {
        Arrays.sort(array, (o1, o2) -> o2[0] - o1[0]);

        int[] dynamic = new int[array.length];
        dynamic[0] = array[0][1];
        int answer = dynamic[0];

        for (int i = 1; i < array.length; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (array[i][0] < array[j][0] && array[i][2] < array[j][2] && dynamic[j] > max) {
                    max = dynamic[j];
                }
            }
            dynamic[i] = max + array[i][1];
            answer = Math.max(answer, dynamic[i]);
        }

        return answer;
    }
}
