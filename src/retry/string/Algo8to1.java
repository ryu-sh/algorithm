package retry.string;

import java.util.Scanner;

public class Algo8to1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        System.out.println(solution(inputString.toLowerCase()));
    }

    private static String solution(String inputString) {
        String reversedString = new StringBuilder(inputString.replaceAll("[^a-z]", "")).reverse().toString();

        if (inputString.replaceAll("[^a-z]", "").equals(reversedString)) {
            return "YES";
        }
        return "NO";
    }
}
