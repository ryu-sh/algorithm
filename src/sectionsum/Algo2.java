package sectionsum;

import java.io.IOException;
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long answer = 0;

        long[] sum = new long[n+1];
        long[] leftOfSum = new long[m];

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int left = (int) sum[i] % m;
            if (left == 0) {
                answer++;
            }
            leftOfSum[left]++;
        }

        for (int i = 0; i < m; i++) {
            if (leftOfSum[i] > 1) {
                answer = answer + (leftOfSum[i] * (leftOfSum[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
