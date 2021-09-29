package dp;

import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(solution(target));
    }

    static int[] array;
    public static int solution(int target) {
        array = new int[target+1];

        return stairs(target);
    }

    private static int stairs(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        if (array[target] != 0) {
            return array[target];
        }

        return stairs(target - 2) + stairs(target - 1);
    }
}
