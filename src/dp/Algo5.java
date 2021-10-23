package dp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        Integer[] array1 = new Integer[number1];

        for (int i = 0; i < number1; i++) {
            array1[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(solution(target, array1));
    }

    private static int solution(int target, Integer[] array1) {
        Arrays.sort(array1);
        int[] targetArray = new int[target+1];
        Arrays.fill(targetArray, Integer.MAX_VALUE);
        targetArray[0] = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = array1[i]; j < targetArray.length; j++) {
                int temp = targetArray[j - array1[i]] + 1;
                targetArray[j] = Math.min(targetArray[j], temp);
            }
        }

        return targetArray[target];
    }
}
