package retry.twopointer;

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
        int left = 0;
        int right = 1;
        int temp = array[0];
        int result = 0;
        while (right < array.length) {
            if (temp == targetNumber) {
                result++;
                left++;
                temp = temp - array[left -1] + array[right];
                right++;
            }
            else if (temp < targetNumber) {
                temp += array[right];
                right++;
            }
            else if (temp > targetNumber) {
                left++;
                temp -= array[left - 1];
            }
        }
        return result;
    }
}
