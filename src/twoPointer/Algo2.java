package twoPointer;

import java.util.*;

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
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (Integer integer : array1) {
            set.add(integer);
        }

        for (int integer : array2) {
            if (set.contains(integer)) {
                list.add(integer);
            }
        }

        Collections.sort(list);
        return list;
    }
}
