package test.tving;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }
    // 3의 제곱수 들 끼리 더할 수 있는 n 번째 수
    //
    public static long solution(long n) {
        long threes = 1;
        long index = 1;
        long temp = n;
        int pow = 1;

        while (temp > 1) {
            temp /= 2;
            pow ++;
        }
        List<Long> list = new LinkedList<>();
        list.add(threes);

        for (int i = 0; i < pow; i++) {
            int range = list.size();
            threes *= 3;
            list.add(threes);
            index ++;
            if (n == index) {
                return threes;
            }
            for (int j = 0; j < range; j++) {
                long l = threes + list.get(j);
                list.add(l);
                index ++;
                if (n == index) {
                    return l;
                }
            }
        }
        return 1;
    }
}
