package array;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(solution(number));
    }

    private static int solution(int number) {
        int result = 0;
        int[] check = new int[number+1];

        for (int i = 2; i <= number; i++) {
            int index = 1;
            if (check[i] == 0) {
                while (index * i <= number) {
                    check[index * i] = 1;
                    index ++;
                }
                result ++;
            }
        }
        return result;
    }
}
