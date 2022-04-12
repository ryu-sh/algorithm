package programmers;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
    }
    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1 ; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private static boolean isPrime(int sum) {
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
