package programmers;

import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] selectedArray = new int[commands[i][1] - commands[i][0] + 1];
            int k = 0;
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                selectedArray[k++] = array[j];
            }
            Arrays.sort(selectedArray);
            answer[i] = selectedArray[commands[i][2] - 1];
        }

        return answer;
    }
}
