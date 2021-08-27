package array;

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
        int currentMax = 0;
        int count = 0;

        for (int height : heights) {
            if (currentMax < height) {
                count ++;
                currentMax = height;
            }
        }

        return count;
    }
}
