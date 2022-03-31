package retry.string;

import java.util.Scanner;

public class Algo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        char inputCharacter = in.next().charAt(0);

        System.out.println(solution(inputString, inputCharacter));
    }

    private static String solution(String inputString, char inputCharacter) {
        int[] distances = new int[inputString.length()];
        int distance = Integer.MAX_VALUE;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputCharacter) {
                distance = 0;
            }
            distances[i] = distance;
            distance ++;
        }
        distance = Integer.MAX_VALUE;
        for (int i = inputString.length() -1; i >= 0 ; i--) {
            if (inputString.charAt(i) == inputCharacter) {
                distance = 0;
            }
            distances[i] = Math.min(distances[i], distance);
            distance ++;
        }
        for (int integer : distances) {
            stringBuilder.append(integer + " ");
        }
        return stringBuilder.toString();
    }

}
