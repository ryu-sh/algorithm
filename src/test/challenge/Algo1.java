package test.challenge;

import test.naver2.Algo2;

import java.util.*;

public class Algo1 {
    public static void main(String[] args) {
        Algo1 algo1 = new Algo1();
        System.out.println(algo1.solution(new String[]{"A B C D", "A D", "A B D", "B D"}, 2) == 7);
        System.out.println(algo1.solution(new String[]{"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"}, 3));
    }
    public int solution(String[] id_list, int k) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String idList : id_list) {
            String[] idArray = idList.split(" ");
            Set<String> set = new HashSet<>(Arrays.asList(idArray));
            for (String id : set) {
                int coupon = map.getOrDefault(id, 0);
                if (coupon < k) {
                    coupon++;
                    answer++;
                }
                map.put(id, coupon);
            }
        }
        return answer;
    }
}
