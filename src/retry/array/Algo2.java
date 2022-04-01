package retry.array;

import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println(solution(numbers));
    }

    private static int solution(int[] heights) {
        int frontHeight = Integer.MIN_VALUE;
        int result = 0;

        for (int height : heights) {
            if (frontHeight < height) {
                result ++;
                frontHeight = height;
            }
        }
        return result;
    }
}
