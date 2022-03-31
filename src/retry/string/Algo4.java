package retry.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < inputNumber; i++) {
            list.add(in.next());
        }
        solution(list);
    }

    private static void solution(List<String> list) {
        for (String string : list) {
            char[] chars = string.toCharArray();
            for (int i = 0; i < string.length() / 2; i++) {
                char reverseChar = string.charAt(string.length() - 1 - i);
                chars[string.length() - 1 - i] = chars[i];
                chars[i] = reverseChar;
                StringBuilder sb = new StringBuilder();
                sb.reverse();
            }
            System.out.println(new String(chars));
        }
    }
}
