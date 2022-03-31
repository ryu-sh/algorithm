package retry.string;

import java.util.Scanner;

public class Algo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (stringBuilder.indexOf(inputString.charAt(i) + "") == -1) {
                stringBuilder.append(inputString.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
