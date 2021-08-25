package string;

import java.util.Scanner;

public class Algo3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        String[] strings = inputString.split(" ");
        System.out.println(solution(strings));
    }

    private static String solution(String[] strings) {
        String resultString = "";
        for (String string : strings) {
            if (string.length() > resultString.length()) {
                resultString = string;
            }
        }
        return resultString;
    }
}


