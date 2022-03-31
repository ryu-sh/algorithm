package retry.string;

import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();

        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLowerCase(inputString.charAt(i))) {
                stringBuilder.append(Character.toUpperCase(inputString.charAt(i)));
            }
            if (Character.isUpperCase(inputString.charAt(i))) {
                stringBuilder.append(Character.toLowerCase(inputString.charAt(i)));
            }
        }
        return stringBuilder.toString();
    }
}
