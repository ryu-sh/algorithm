package array;

import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] fibo = solution(number);
        for (int i = 1; i < fibo.length; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    private static int[] solution(int number) {
        int[] fibo = new int[number+1];
        fibo[1] = 1;
        fibo[2] = 1;
        fibonaci(fibo, number);
        return fibo;
    }

    private static int fibonaci(int[] fibo, int number) {
        if (fibo[number] != 0) {
            return fibo[number];
        }

        fibo[number] = fibonaci(fibo, number-2) + fibonaci(fibo, number-1);

        return fibo[number];
    }
}
