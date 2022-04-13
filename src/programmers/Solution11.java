package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution11 {
    public static void main(String[] args) {
//        solution(new int[]{1,3,2,4,2});
        System.out.println(-1 % 5);
    }
    public static int[] solution(int[] answers) {
        int[] first = new int[]{1, 2, 3, 4, 5};
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] counts = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[(i + first.length) % first.length]) {
                counts[0]++;
            }
            if (answers[i] == second[(i + second.length) % second.length]) {
                counts[1]++;
            }
            if (answers[i] == third[(i + third.length) % third.length]) {
                counts[2]++;
            }
        }

        int maxCount = Math.max(counts[0], Math.max(counts[1], counts[2]));
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount) {
                answerList.add(i+1);
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
