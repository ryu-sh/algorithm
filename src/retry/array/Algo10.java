package retry.array;

import java.util.Scanner;

public class Algo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[][] array = new int[number+2][number+2];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                array[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(array));
    }

    private static int solution(int[][] array) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int result = 0;

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[0].length - 1; j++) {
                boolean isGreatest = true;
                for (int k = 0; k < dx.length; k++) {
                    if (array[i][j] <= array[i + dx[k]][j + dy[k]]) {
                        isGreatest = false;
                        break;
                    }
                }
                if (isGreatest) {
                    result++;
                }
            }
        }

        return result;
    }
}
