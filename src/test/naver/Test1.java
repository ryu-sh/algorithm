package test.naver;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    // 배열의 수와 갯수가 같은것 중 최대의 수
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,1,2,8,2}) == 2);
        System.out.println(solution(new int[]{3, 8, 2, 3, 3, 2}) == 3);
        System.out.println(solution(new int[]{3,1,4,1,5}) == 0);
        System.out.println(solution(new int[]{5,5,5,5,5}) == 5);
    }

    public static int solution(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) {
                continue;
            }
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }

        for (Integer key : map.keySet()) {
            if (key == map.get(key)) {
                max = Math.max(max, key);
            }
        }
        return max;
    }

}
