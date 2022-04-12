package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int count = 0;
        while(count < completion.length) {
            if (!participant[count].equals(completion[count])) {
                return participant[count];
            }
            count++;
        }
        if (count == completion.length) {
            return participant[count];
        }
        return answer;
    }
}
