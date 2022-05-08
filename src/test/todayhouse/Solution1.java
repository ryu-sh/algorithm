package test.todayhouse;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        solution("SSSSSSWWWNNNNNN");
    }

    public static String[] solution(String path) {
        int time = 0;
        int meter = 1;
        String direction = "";
        List<String> results = new LinkedList<>();

        for (int i = 0; i < path.length() - 1; i++) {
            char currentDirection = path.charAt(i);
            char nextDirection = path.charAt(i + 1);
            if (currentDirection != nextDirection) {
                direction = turnDirection(currentDirection, nextDirection);
                if (meter > 5) {
                    time = time + meter - 5;
                    meter = 5;
                }
                results.add(String.format("Time %d: Go straight %dm and turn %s", time, meter * 100, direction));
                time = i + 1;
                meter = 1;
            }
            else {
                meter++;
            }
        }
        String[] resultArray = new String[results.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = results.get(i);
        }
        return resultArray;
    }

    private static String turnDirection(char currentDirection, char nextDirection) {
        if (currentDirection == 'E' && nextDirection == 'N') {
            return "left";
        }
        if (currentDirection == 'E' && nextDirection == 'S') {
            return "right";
        }
        if (currentDirection == 'N' && nextDirection == 'W') {
            return "left";
        }
        if (currentDirection == 'N' && nextDirection == 'E') {
            return "right";
        }
        if (currentDirection == 'W' && nextDirection == 'S') {
            return "left";
        }
        if (currentDirection == 'W' && nextDirection == 'N') {
            return "right";
        }
        if (currentDirection == 'S' && nextDirection == 'W') {
            return "right";
        }
        if (currentDirection == 'S' && nextDirection == 'E') {
            return "left";
        }
        return "";
    }

}
