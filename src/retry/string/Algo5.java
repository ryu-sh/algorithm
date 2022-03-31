package retry.string;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;
        while (left < right) {
            if (Character.isAlphabetic(inputString.charAt(left))) {

            }
            left ++;
            right --;
        }
        return null;
    }
}
