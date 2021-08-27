package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();

        System.out.println(solution(inputString));
    }

    private static int solution(String inputString) {
        char[] characters = inputString.toCharArray();
        List<Integer> numbers = new ArrayList<>();
        for (char character : characters) {
            if(Character.isDigit(character)) {
                numbers.add(Integer.parseInt(character+""));
            }
        }
        int pow = numbers.size()-1;
        int result = 0;
        for (Integer number : numbers) {
            int temp = (int)Math.pow(10, pow);
            result += temp * number;
            pow--;
        }
        return result;
    }

    private static int solution2(String inputString) {
        char[] characters = inputString.toCharArray();
        int result = 0;

        for (char character : characters) {
            if (Character.isDigit(character)) {
                result = result * 10 + (character - '0');
            }
        }
        return result;
    }
}
