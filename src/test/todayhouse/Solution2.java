package test.todayhouse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcdefabc"));
        System.out.println(solution("abxdeydeabz"));;
        System.out.println(solution("ABCabcA"));;
    }
    public static String solution(String call) {
        List<String> patterns = new LinkedList<>();
        List<String> tempPatterns = new ArrayList<>();
        List<Integer> upperIndex = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int patternCount = 0;
        int patternMaxSize = (call.length() - 1) / 2;

        for (int i = 0; i < call.length(); i++) {
            if (Character.isUpperCase(call.charAt(i))) {
                upperIndex.add(i);
            }
        }

        call = call.toLowerCase();
        for (int i = 1; i <= patternMaxSize; i++) {
            for (int j = 0; j + i < call.length(); j++) {
                int tempPatternCount = 1;
                String tempPattern = call.substring(j, j+i);
                if (tempPatterns.contains(tempPattern)) {
                    continue;
                }
                String tempCall = call.substring(j + 1);
                int k = 0;
                while (tempCall.length() >= k + i) {
                    String tempTempPattern = tempCall.substring(k, k+i);
                    if (tempPattern.equals(tempTempPattern)) {
                        tempPatternCount++;
                    }
                    tempCall = tempCall.substring(k + 1);
                }
                tempPatterns.add(tempPattern);
                if (patternCount <= tempPatternCount) {
                    if (patternCount == tempPatternCount) {
                        patterns.add(tempPattern);
                    }
                    if (patternCount < tempPatternCount) {
                        patterns.clear();
                        patterns.add(tempPattern);
                    }
                    patternCount = tempPatternCount;
                }
            }
            tempPatterns.clear();
        }
        for (String pattern : patterns) {
            call = call.replaceAll(pattern, "\\*");
        }
        for (Integer index : upperIndex) {
            if (call.charAt(index) != '*') {
                call = call.substring(0, index) + Character.toUpperCase(call.charAt(index)) + call.substring(index+1);
            }
        }

        return  call.replaceAll("\\*", "");
    }
}
