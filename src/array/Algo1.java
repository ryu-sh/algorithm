package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = in.nextInt();
        }
        List<Integer> result = solution(numbers);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> solution(int[] numbers) {
        int prev = numbers[0];
        List<Integer> result = new ArrayList<>();
        result.add(prev);

        for (int i = 1; i < numbers.length; i++) {
            if (prev < numbers[i]) {
                result.add(numbers[i]);
            }
            prev = numbers[i];
        }
        return result;
    }
}
