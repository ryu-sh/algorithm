package string;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String inputString = in.next();
        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        char[] characterArray = inputString.toCharArray();
        int limit = characterArray.length;
        for (int i = 0; i < limit; i++) {
            if (isAlphabet(characterArray[i])) {
                for (int j = limit-1; j > i; j--) {
                    if (isAlphabet(characterArray[j])) {
                        char temp = characterArray[i];
                        characterArray[i] = characterArray[j];
                        characterArray[j] = temp;
                        limit = j;
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : characterArray) {
            sb.append(c);
        }
        return sb.toString();
    }

    private static boolean isAlphabet(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            return true;
        }
        return false;
    }
}
