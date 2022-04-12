package retry.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int[] array1 = new int[number1];

        for (int i = 0; i < number1; i++) {
            array1[i] = in.nextInt();
        }

        int number2 = in.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = in.nextInt();
        }

        List<Integer> list = solution(array1, array2);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> solution(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int left = 0;
        int right = 0;
        List results = new ArrayList();

        while(left < array1.length && right < array2.length) {
            if (array1[left] == array2[right]) {
                results.add(array1[left]);
            }
            if (array1[left] < array2[right]) {
                left++;
            }
            else if (array1[left] == array2[right]) {
                left++;
                right++;
            }
            else {
                right++;
            }
        }
        return results;
    }
}
