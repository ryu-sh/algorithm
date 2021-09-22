package array;

import java.util.Scanner;

public class Algo12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int[][] array = new int[number2 + 1][number1 + 1];

        for (int i = 1; i <= number2; i++) {
            for (int j = 1; j <= number1; j++) {
                array[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(array));
    }

    //4중 포문
    private static int solution(int[][] array) {
        int answer = 0;

        for (int i = 1; i < array[0].length; i++) {
            for (int j = 1; j < array[0].length; j++) {
                int temp = 0;
                if (i == j) {
                    continue;
                }
                for (int k = 1; k < array.length; k++) {
                    int mentor = -1;
                    int mentee = -1;
                    for (int l = 1; l < array[0].length; l++) {
                        if (array[k][l] == i) {
                            mentor = l;
                        }
                        if (array[k][l] == j) {
                            mentee = l;
                        }
                    }
                    if (mentor >= mentee) {
                        break;
                    }
                    temp++;
                }
                if (temp == array.length - 1) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
