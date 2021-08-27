package string;

import java.util.Scanner;

public class Algo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        if (solution(inputString)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static boolean solution(String inputString) {
        char[] characterArray = inputString.toLowerCase().toCharArray();
        int left = 0;
        int right = characterArray.length-1;

        while (left < right) {
            if (characterArray[left] != characterArray[right]) {
                return false;
            }
            left ++;
            right --;
        }
        String reverse = new StringBuilder(inputString).reverse().toString();
//        if (inputString.equalsIgnoreCase(reverse)) {
//            return true;
//        }
//        else {
//            return false;
//        }
        return true;
    }


}
