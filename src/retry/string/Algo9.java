package retry.string;

import java.util.Scanner;

public class Algo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.println(solution(inputString.toLowerCase()));
    }

    private static int solution(String inputString) {
        String replacedString = inputString.replaceAll("[a-z]", "");
        return Integer.parseInt(replacedString);
    }
}
