package programmers;

import java.util.PriorityQueue;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7) == 2);
    }
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        int answer = 0;

        for (int sco : scoville) {
            pq.add(sco);
        }

        while (!pq.isEmpty() && pq.size() > 1) {
            Integer scovile1 = pq.poll();
            Integer scovile2 = pq.poll();

            if (scovile1 >= K) {
                pq.clear();
                break;
            }

            if (scovile1 < K) {
                pq.add(scovile1 + scovile2 * 2);
                answer++;
            }
        }

        if (pq.size() != 0) {
            if (pq.poll() > K) {
                return answer;
            }
            return -1;
        }
        return answer;

    }
}
