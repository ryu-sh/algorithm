package retry.array;

import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = solution(number);
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] solution(int target) {
        int[] array = new int[target+1];
        array[1] = 1;
        array[2] = 1;
        fibonacci(array, target);

        return array;
    }

    private static int fibonacci(int[] array, int target) {
        if (target == 1 || target == 2) {
            return 1;
        }
        array[target] = fibonacci(array, target - 2) + fibonacci(array, target - 1);
        return array[target];
    }
}
