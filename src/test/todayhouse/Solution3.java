package test.todayhouse;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {
//        System.out.println(solution("this is {template} {template} is {state}",new String[][]{{"template", "string"}, {"state", "changed"}}));
//        System.out.println(solution("this is {template} {template} is {state}",new String[][]{{"template", "{state}"}, {"state", "{templates}"}}));
        System.out.println(solution("this is {template} {template} is {state}",new String[][]{{"template", "{state}"}, {"state", "{template}"}}));
        System.out.println(solution("{a} {b} {c} {d} {i}",new String[][]{{"b", "{c}"}, {"a", "{b}"}, {"e", "{f}"}, {"h", "i"}, {"d", "{e}"}, {"f", "{d}"}, {"c", "d"}}));
    }
    public static String solution(String tstring, String[][] variables) {
        Map<String, String> variableMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        int maxChangedCount = variables.length * variables.length;
        String original = tstring;

        for (int i = 0; i < variables.length; i++) {
            for (int j = 0; j < variables[0].length; j++) {
                variableMap.put(variables[i][0], variables[i][1]);
                countMap.put(variables[i][0], 0);

            }
        }
        int changeCount = 0;
        while (tstring.contains("{") && changeCount <= maxChangedCount) {
            int index1 = tstring.indexOf("{");
            int index2 = tstring.indexOf("}");
            String template = tstring.substring(index1+1, index2);
            String variable = variableMap.get(template);
            if (variable == null) {
                changeCount++;
                continue;
            }
            tstring = tstring.replaceAll("\\{"+template+"\\}", variable);
            countMap.put(template, countMap.get(template)+1);
            changeCount++;
        }

        for (String countTemplate : countMap.keySet()) {
            if (countMap.get(countTemplate) > 5) {

            }
        }

        return tstring;
    }
}
