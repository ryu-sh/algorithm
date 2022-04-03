package retry.array;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(solution(number));
    }

    private static int solution(int number) {
        int result = 0;
        boolean[] isNotPrimeNumbers = new boolean[number+1];

        for (int i = 2; i <= number; i++) {
            if (!isNotPrimeNumbers[i]) {
                result ++;
                int tempNumber = i;
                while (tempNumber <= number) {
                    isNotPrimeNumbers[tempNumber] = true;
                    tempNumber += i;
                }
            }
        }
        return result;
    }
}
