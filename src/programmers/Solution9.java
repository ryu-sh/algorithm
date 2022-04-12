package programmers;

import java.util.LinkedList;
import java.util.List;

public class Solution9 {
    public static void main(String[] args) {
        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new LinkedList<>();
        int maxDays = -1;
        int count = 0;
        for (int i = 0; i < progresses.length; i++) {
            int tempDays = 0;
            int leftWork = 100 - progresses[i];
            if (leftWork % speeds[i] == 0) {
                tempDays = leftWork / speeds[i];
            }
            else {
                tempDays = leftWork / speeds[i] + 1;
            }
            if (tempDays > maxDays) {
                maxDays = tempDays;
                list.add(count);
                count = 1;
            }
            else {
                count++;
            }
        }
        int[] answer = new int[list.size()];
        int index = 0;
        for (Integer integer : list) {
            answer[index] = integer;
            index++;
        }
        return answer;
    }
}
