package retry.string;

import java.util.Scanner;

public class Algo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();

        System.out.println(solution(inputString.toLowerCase()));
    }

    private static String solution(String inputString) {
        String result = "YES";
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                return result = "NO";
            }
        }
        return result;
    }
}
