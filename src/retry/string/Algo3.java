package retry.string;

import java.util.Scanner;

public class Algo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        String[] strings = inputString.split(" ");
        String result = "";
        for (String string : strings) {
            if (result.length() <= string.length()) {
                result = string;
            }
        }
        return result;
    }
}
