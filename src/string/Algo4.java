package string;

import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number = in.nextInt();
        String[] array = new String[number];
        for (int i = 0; i < number; i++) {
            array[i] = in.next();
        }
        solution(array);
    }

    private static void solution(String[] array) {
        for (String string : array) {
            StringBuilder sb = new StringBuilder();
            //sb.reverse()
            for (int i = string.length()-1; i >= 0; i--) {
                sb.append(string.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
