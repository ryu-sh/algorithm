package dfs;

import java.util.Scanner;

public class Algo2 {
    static int numberMaxIndex;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberMaxIndex = scanner.nextInt();

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }

    private static void dfs(int number, int numberIndex) {
        if (numberMaxIndex == numberIndex) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (isPrime(number * 10 + i)) {
                dfs(number * 10 + i, numberIndex + 1);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
