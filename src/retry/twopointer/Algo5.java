package retry.twopointer;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int change = in.nextInt();
        int[] array = new int[range];
        for (int i = 0; i < range; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(solution(array, change));
    }

    private static int solution(int[] array, int change) {
        int right = 0;
        int left = 0;
        int temp = 0;
        int max = 0;
        int tempChange = 0;

        while (right != array.length) {
            if (array[right] == 0) {
                tempChange++;
                while (change < tempChange) {
                    if (array[left] == 0) {
                        tempChange--;
                    }
                    left++;
                    temp--;
                }
            }
            right++;
            temp++;
            max = Math.max(max, temp);
        }
        return max;
    }
}
