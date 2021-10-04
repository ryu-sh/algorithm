package test.woowa;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Algo4 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"A","B","C"}, new String[]{"B", "C", "A"}));;
        System.out.println(solution(new String[]{"A","B","C"}, new String[]{"D", "E", "C"}));;
        System.out.println(solution(new String[]{"A","B","C","D"}, new String[]{"B", "Z", "D", "C"}));;
    }
    static int answer;
    static Map<String, String> map;
    public static int solution(String[] before, String[] after) {
        answer = 0;
        map = new HashMap<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < before.length; i++) {
            map.put(before[i], after[i]);
        }

        for (int i = 0; i < before.length; i++) {
            stack.push(before[i]);

            while (!stack.isEmpty() && before[i] != after[i] && map.get(before[i]) != null) {
                String beforeFile = stack.peek();
                String afterFile = map.get(beforeFile);
                if (before[i] == afterFile) {
                    answer += 2 ;
                    map.put(before[i], "TEMP");
                    map.put(beforeFile, null);
                    stack.pop();
                    continue;
                }
                if (map.get(afterFile) == null) {
                    answer ++;
                    map.put(beforeFile, null);
                    stack.pop();
                }
                else {
                    stack.push(afterFile);
                }
            }
        }
        return answer;
    }

    public static void change(String original, String before, String target) {
        if (original == target) {

            return;
        }

            if (map.get(target) == null) {
                answer ++;
                map.put(before, null);
            }
            else {
                change(original, target, map.get(target));
                answer ++;
                map.put(before, null);
            }

    }
}
