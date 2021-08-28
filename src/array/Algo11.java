package array;

public class Algo11 {
    private static int solution(int[][] array) {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int same = 0;
            for (int j = 0; j < array[0].length; j++) {
                int current = array[i][j];
                for (int k = 0; k < array.length; k++) {
                    if (j == k) {
                        continue;
                    }
                    if (array[k][j] == current) {
                        same ++;
                    }
                }
            }
            if (same > max) {
                max = same;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
