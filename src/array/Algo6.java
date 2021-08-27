package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = in.nextInt();
        }

        List<Integer> list = solution(array);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> solution(int[] array) {
        List<Integer> primes = new ArrayList<>();

        for (int number : array) {
            int newNumber = reverse(number);
            if (isPrime(newNumber)) {
                primes.add(newNumber);
            }
        }

        return primes;
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
}
