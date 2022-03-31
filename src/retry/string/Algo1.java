package retry.string;

import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        char inputCharacter = in.next().toLowerCase().charAt(0);

        System.out.println(solution(inputString, inputCharacter));
    }

    private static int solution(String inputString, char inputCharacter) {
        int result = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputCharacter == inputString.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
