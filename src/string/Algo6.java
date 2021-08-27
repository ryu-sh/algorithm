package string;

import java.util.*;

public class Algo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
//        System.out.println(solution(inputString).equals("kset"));
        System.out.println(solution(inputString));
    }

    private static String solution(String inputString) {
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < inputString.length(); i++) {
            set.add(inputString.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }
}
