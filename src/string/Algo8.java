package string;

import java.util.Locale;
import java.util.Scanner;

public class Algo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        if (solution(inputString)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static boolean solution(String inputString) {
        // 대문자로 만들고 대문자 아닌 숫자 전부 빈값으로 교체 후 reverse -> equals 비교
        // inputString = inputString.toUpperCase().replaceAll("[^A-Z]", "");

        char[] characterArray = inputString.toLowerCase().trim().toCharArray();
        int left = 0;
        int right = characterArray.length-1;

        while (left < right) {
            while (!Character.isAlphabetic(characterArray[left]) && left < right) {
                left ++;
            }

            while (!Character.isAlphabetic(characterArray[right]) && left < right) {
                right --;
            }

            if (characterArray[left] != characterArray[right]) {
                return false;
            }
            else {
                left ++;
                right --;
            }
        }
        return true;
    }
}
