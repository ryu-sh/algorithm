package test.naver2;

import java.util.*;

public class Algo2 {
    public static void main(String[] args) {
        Algo2 algo2 = new Algo2();
        System.out.println(algo2.solution("Sun 10:00-20:00\n" +
                "Fri 05:00-10:00\n" +
                "Fri 16:30-23:50\n" +
                "Sat 10:00-24:00\n" +
                "Sun 01:00-04:00\n" +
                "Sat 02:00-06:00\n" +
                "Tue 03:30-18:15\n" +
                "Tue 19:00-20:00\n" +
                "Wed 04:25-15:14\n" +
                "Wed 15:14-22:40\n" +
                "Thu 00:00-23:59\n" +
                "Mon 05:00-13:00\n" +
                "Mon 15:00-21:00"));
        System.out.println(algo2.solution("Mon 01:00-23:00\n" +
                "Tue 01:00-23:00\n" +
                "Wed 01:00-23:00\n" +
                "Thu 01:00-23:00\n" +
                "Fri 01:00-23:00\n" +
                "Sat 01:00-23:00\n" +
                "Sun 01:00-21:00"));
    }

    public int solution(String S) {
        // write your code in Java SE 8
        String[] schedules = S.split("\n");
        Map<String, List> map = new HashMap<>();
        String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int answer = 0;

        for (String schedule : schedules) {
            List dayList = map.getOrDefault(schedule.substring(0, 3), new ArrayList<String>());
            dayList.add(schedule);
            map.put(schedule.substring(0, 3), dayList);
        }

        for (List value : map.values()) {
            Collections.sort(value);
        }

        int prevMin = 0;
        for (String day : days) {
            List list = map.get(day);
            int temp = 0;

            for (Object o : list) {
                String schedule = (String) o;
                int startHour = Integer.parseInt(schedule.substring(4,6));
                int startMin = Integer.parseInt(schedule.substring(7,9));
                temp = (startHour * 60 + startMin) - prevMin;

                int endHour = Integer.parseInt(schedule.substring(10,12));
                int endMin = Integer.parseInt(schedule.substring(13,15));
                prevMin = endHour * 60 + endMin;
                answer = Math.max(temp, answer);
            }
            int dayEndMin = 24 * 60;
            if (day.equals("Sun")) {
                answer = Math.max(answer, dayEndMin - prevMin);
            }
            prevMin = prevMin - dayEndMin;
        }

        return answer;
    }


}
