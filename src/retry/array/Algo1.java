package retry.array;

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
        solution(numbers)
                .forEach(integer -> System.out.print(integer + " "));

    }

    private static List<Integer> solution(int[] numbers) {
        int prev = Integer.MIN_VALUE;
        List<Integer> results = new ArrayList<>();

        for (int number : numbers) {
            if (prev < number) {
                results.add(number);
            }
            prev = number;
        }
        return results;
    }


}
