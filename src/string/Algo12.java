package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String inputString = in.next();


        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        List<String> encryprions = splitString(inputString);
        List<String> binaryCharacters = convertBinary(encryprions);
        List<Integer> numbers = convertNumber(binaryCharacters);

        StringBuilder sb = new StringBuilder();
        for (Integer number : numbers) {
            int result = number;
            char resultCharacter = (char) result;
            sb.append(resultCharacter);
        }

        return sb.toString();
    }


    private static List<Integer> convertNumber(List<String> encryprions) {
        List<Integer> numbers = new ArrayList<>();

        for (String encryprion : encryprions) {
            int pow = encryprion.length() - 1;
            int result = 0;
            // 2진수 10진수로 변경
//            Integer.parseInt(encryprion,2);
            numbers.add(Integer.parseInt(encryprion,2));
//            for (int i = 0; i < encryprion.length(); i++) {
//                int number = encryprion.charAt(i) - '0';
//                result += number * Math.pow(2, pow);
//                pow --;
//            }
//            numbers.add(result);
        }

        return numbers;
    }

    //replace 사용
    private static List<String> convertBinary(List<String> encryprions) {
        List<String> result = new ArrayList<>();
        for (String encryprion : encryprions) {
//            char[] characterArray = encryprion.toCharArray();
//            for (int i = 0; i < characterArray.length; i++) {
//                if (characterArray[i] == '#') {
//                    characterArray[i] = '1';
//                }
//                else {
//                    characterArray[i] = '0';
//                }
//            }
//            result.add(String.valueOf(characterArray));
            result.add(encryprion.replaceAll("#","1").replaceAll("\\*","0"));
        }
        return result;
    }

    private static List<String> splitString(String inputString) {
        List<String> encryprions = new ArrayList<>();
        int limit = inputString.length() / 7;

//        if (inputString.length() % 7 == 0) {
//            limit = inputString.length() / 7;
//        }
//        else {
//            limit = inputString.length() / 7 + 1;
//        }

        for (int i = 0; i < limit; i++) {
            encryprions.add(inputString.substring(0,7));
            inputString = inputString.substring(7);
        }

        return encryprions;
    }


}
