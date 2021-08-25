package string;

import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String inputString = in.next();
        System.out.println(solution(inputString));
    }

    public static String solution(String inputString) {
        char[] characterArray = inputString.toCharArray();

        for (int i = 0; i < characterArray.length; i++) {
            if ( characterArray[i] <= 90 &&  characterArray[i] >= 65) {
                characterArray[i] = Character.toLowerCase(characterArray[i]);
                continue;
            }
            if (characterArray[i] <= 122 && characterArray[i] >= 97) {
                characterArray[i] = Character.toUpperCase(characterArray[i]);
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : characterArray) {
            sb.append(c);
        }

        return sb.toString();
    }
}
