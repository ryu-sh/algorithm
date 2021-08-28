package array;

public class Algo10 {

    private static int solution(int[][] array) {
        int result = 0;
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 1; j < array[0].length-1; j++) {
                if (array[i][j] > array[i-1][j]) {
                    if (array[i][j] > array[i+1][j]) {
                        if (array[i][j] > array[i][j-1]) {
                            if (array[i][j] > array[i][j+1]) {
                                result ++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    private static int solution2() {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        return 0;
    }
}
