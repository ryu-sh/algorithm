package programmers;

import java.util.Arrays;

public class Solution3 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        boolean[] lottNumbers = new boolean[46];
        int check = 0;
        int zeroCheck = 0;

        for (int win_num : win_nums) {
            lottNumbers[win_num] = true;
        }

        for (int lotto : lottos) {
            if (lotto != 0 && lottNumbers[lotto]) {
                check++;
            }
            if (lotto == 0) {
                zeroCheck++;
            }
        }
        answer[0] = findResult(zeroCheck + check);
        answer[1] = findResult(check);

        return answer;
    }

    private static int findResult(int checkNumber) {
        switch (checkNumber) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
