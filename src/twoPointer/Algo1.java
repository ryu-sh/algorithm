package twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Algo1 {
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
        List<Integer> result = new ArrayList<>();

        for (int number : array1) {
            result.add(number);
        }

        for (int number : array2) {
            result.add(number);
        }

        Collections.sort(result);

        return result;
    }

    // 2pointer 사용하여 2개 배열 비교한다.
    private static List<Integer> solution2(int[] array1, int[] array2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int resultIndex = 0;
        int[] result = new int[array1.length + array2.length];
        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] <= array2[pointer2]) {
                result[resultIndex] = array1[pointer1++];
            }
            else {
                result[resultIndex] = array2[pointer2++];
            }
            resultIndex++;
        }
        while (pointer1 < array1.length) {
            result[resultIndex] = array1[pointer1++];
            resultIndex++;
        }
        while (pointer2 < array2.length) {
            result[resultIndex] = array2[pointer2++];
            resultIndex++;
        }
        return null;
    }

}
