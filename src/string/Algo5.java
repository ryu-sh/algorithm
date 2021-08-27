package string;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        String inputString = in.next();
//        System.out.println(solution(inputString));
        if (solution("a#b!GE*T@S").equals("S#T!EG*b@a")) {
            System.out.println("?????");
        }
    }

    private static String solution(String inputString) {
        char[] characterArray = inputString.toCharArray();
        int limit = characterArray.length;
        //while문 사용해보기 left, right
        //Character.isAlphabetic()
//        for (int i = 0; i < limit; i++) {
//            if (isAlphabet(characterArray[i])) {
//                for (int j = limit-1; j > i; j--) {
//                    if (isAlphabet(characterArray[j])) {
//                        char temp = characterArray[i];
//                        characterArray[i] = characterArray[j];
//                        characterArray[j] = temp;
//                        limit = j;
//                        break;
//                    }
//                }
//            }
//        }
        int left = 0;
        int right = characterArray.length-1;
        while (left < right) {
            if (!Character.isAlphabetic(characterArray[left])) {
                left ++;
            }
            else if (!Character.isAlphabetic(characterArray[right])) {
                right --;
            }
            else {
                char temp = characterArray[left];
                characterArray[left] = characterArray[right];
                characterArray[right] = temp;
                left ++;
                right --;
            }
        }
        return String.valueOf(characterArray);
    }

    private static boolean isAlphabet(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            return true;
        }
        return false;
    }
}
