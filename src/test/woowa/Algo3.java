package test.woowa;

import java.util.Arrays;
import java.util.Comparator;

public class Algo3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{2500,3},{700,5}}));;
    }
    public static int solution(int[][] money) {
        Arrays.sort(money, (o1, o2) -> o2[0] - o1[0]);
        int first = 0;
        int second = 0;
        for (int i = 0; i < money.length; i++) {
            for (int j = 0; j < money[i][1]; j++) {
                if (first <= second) {
                    first += money[i][0];
                }
                else {
                    second += money[i][0];
                }
            }
        }
        return Math.abs(first - second);
    }
}
