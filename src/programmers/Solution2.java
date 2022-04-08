package programmers;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportMap = new HashMap();
        Map<String, Integer> reportCountMap = new HashMap<>();
        Map<String, Integer> idIndexMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idIndexMap.put(id_list[i], i);
        }

        for (String string : report) {
            HashSet reports = reportMap.getOrDefault(string.split(" ")[1], new HashSet<>());
            reports.add(string.split(" ")[0]);
            reportMap.put(string.split(" ")[1], reports);
        }

        for (String reportedId : reportMap.keySet()) {
            reportCountMap.put(reportedId, reportMap.get(reportedId).size());
        }

        for (String id : reportCountMap.keySet()) {
            if (reportCountMap.get(id) >= k) {
                reportMap.get(id).stream()
                        .forEach(reportId -> {
                            answer[idIndexMap.get(reportId)]++;
                        });
            }
        }

        return answer;
    }
}
