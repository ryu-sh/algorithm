package retry.string;

import java.util.Scanner;

public class Algo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        System.out.println(solution(inputString.toLowerCase()));
    }

    private static String solution(String inputString) {
        String result = "YES";
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (!Character.isAlphabetic(inputString.charAt(left))) {
                left ++;
            }
            else if (!Character.isAlphabetic(inputString.charAt(right))) {
                right --;
            }
            else if (inputString.charAt(left) != inputString.charAt(right)) {
                return "NO";
            }
            else {
                left ++;
                right --;
            }
        }
        return result;
    }
}
