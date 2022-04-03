package retry.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = in.nextInt();
        }
        solution(numbers).stream()
        .forEach(o -> System.out.print(o + " "));
    }

    private static List solution(int[] numbers) {
        List result = new ArrayList();

        for (int number : numbers) {
            int reverseNumber = reverse(number);
            if (isPrime(reverseNumber)) {
                result.add(reverseNumber);
            }
        }
        return result;
    }

    private static int reverse(int number) {
        int temp = number % 10;
        int result = 0;
        while (number > 0) {
            result = result * 10 + temp;
            number = number / 10;
            temp = number % 10;
        }

        return result;
    }

    private static boolean isPrime(int newNumber) {
        if (newNumber == 1 || newNumber == 0) {
            return false;
        }
        for (int i = 2; i < newNumber; i++) {
            if (newNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
