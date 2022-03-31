package retry.string;

import java.util.Scanner;

public class Algo11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        char prev = ' ';
        int sequence = 1;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == prev) {
                sequence ++;
            }
            else {
                if (sequence != 1) {
                    stringBuilder.append(Integer.toString(sequence));
                }
                stringBuilder.append(inputString.charAt(i));
                prev = inputString.charAt(i);
                sequence = 1;
            }
        }
        if (sequence != 1) {
            stringBuilder.append(Integer.toString(sequence));
        }
        return stringBuilder.toString();
    }
}
