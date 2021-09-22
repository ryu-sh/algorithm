package array;

import java.util.Scanner;

public class Algo11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[][] array = new int[number + 1][5];

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(array));
    }
    private static int solution(int[][] array) {
        int max = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            int tempMax = 0;
            for (int j = 1; j < array.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < array[0].length; k++) {
                    if (array[i][k] == array[j][k]) {
                        tempMax++;
                        break;
                    }
                }
            }
            if (max < tempMax) {
                max = tempMax;
                maxIndex = i;
            }
        }

        if (maxIndex == 0 && max == 0) {
            return 1;
        }

        return maxIndex;
    }
}
