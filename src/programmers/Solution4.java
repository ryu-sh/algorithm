package programmers;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(solution(14));
    }
    public static String solution(int n) {
        int[] numbers = {4,1,2};
        String answer = "";

        while (n > 0) {
            answer = numbers[n % 3] + answer;
            if (n % 3 == 0) {
                n = (n / 3) - 1;
                continue;
            }
            n /= 3;
        }

        return answer;
    }
}
