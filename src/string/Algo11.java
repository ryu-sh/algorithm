package string;

import java.util.Scanner;

public class Algo11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();

        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        int count = 1;
        char prevCharacter = inputString.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < inputString.length(); i++) {
            if (prevCharacter == inputString.charAt(i)) {
                count ++;
            }
            else {
                sb.append(prevCharacter);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
                prevCharacter = inputString.charAt(i);
            }
        }
        sb.append(prevCharacter);
        if (count > 1) {
            sb.append(count);
        }

        return sb.toString();
    }
}
