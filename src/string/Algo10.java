package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        char inputCharacter = in.next().charAt(0);

//        int[] resultArray = solution(inputString, inputCharacter);
        int[] resultArray = solution2(inputString, inputCharacter);

        for (int result : resultArray) {
            System.out.print(result + " ");
        }
    }

    private static int[] solution(String inputString, char inputCharacter) {
        List<Integer> targetIndexes = new ArrayList<>();
        int[] resultArray = new int[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            if (inputCharacter == inputString.charAt(i)) {
                targetIndexes.add(i);
            }
        }

        for (int i = 0; i < inputString.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (Integer targetIndex : targetIndexes) {
                min = Integer.min(min, Math.abs(targetIndex - i));
            }
            resultArray[i] = min;
        }

        return resultArray;
    }

    // 왼쪽에서 오른쪽 배열 탐색
    // 오른쪽에서 배열 탐색
    // 그중에서 제일 적은 값을 결과 배열에 넣는다.
    private static int[] solution2(String inputString, char inputCharacter) {
        int temp = 100;
        int[] resultArray = new int[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            if (inputCharacter == inputString.charAt(i)) {
                temp = 0;
                resultArray[i] = temp;
            }
            else {
                temp ++;
                resultArray[i] = temp;
            }
        }

        for (int i = inputString.length()-1; i >= 0; i--) {
            if (inputCharacter != inputString.charAt(i)) {
                temp ++;
                resultArray[i] = Math.min(temp, resultArray[i]);
            }
            else {
                temp = 0;
            }
        }
        return resultArray;
    }


}
