package array;

import java.util.Scanner;

public class Algo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int count = 0;
        int result = 0;

        for (int answer : array) {
            if (answer == 1) {
                count ++;
                result += count;
            }
            else {
                count = 0;
            }
        }

        return result;
    }
}
