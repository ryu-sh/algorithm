package programmers;

public class Solution6 {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] array = new boolean[10];

        for (int number : numbers) {
            array[number] = true;
        }

        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                answer += i;
            }
        }
        return answer;
    }
}
