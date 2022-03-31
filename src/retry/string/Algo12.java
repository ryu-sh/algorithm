package retry.string;

import java.util.Scanner;

public class Algo12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        String inputString = in.next();

        System.out.println(solution(inputNumber, inputString));
    }

    private static String solution(int inputNumber, String inputString) {
        String replacedString = inputString.replaceAll("#", "1").replaceAll("\\*", "0");
        char[] result = new char[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            String substring = replacedString.substring(i * 7, (i + 1) * 7);
            result[i] = (char)Integer.parseInt(substring, 2);
        }

        return new String(result);
    }
}
