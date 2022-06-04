package secondarySearch;

import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalLesson = scanner.nextInt();
        int count = scanner.nextInt();
        int end = 0;
        int start = 0;
        int result = Integer.MAX_VALUE;
        int[] lessons = new int[totalLesson];
        for (int i = 0; i < totalLesson; i++) {
            int time = scanner.nextInt();
            lessons[i] = time;
            end += time;
            if (start < time) {
                start = time;
            }
        }

        while (start <= end) {
            int middle = (start + end) / 2;
            int tempCount = 0;
            int sum = 0;
            for (int i = 0; i < totalLesson; i++) {
                if (sum + lessons[i] <= middle) {
                    sum += lessons[i];
                }
                else {
                    sum = lessons[i];
                    tempCount ++;
                }
            }
            if (sum > 0) {
                tempCount ++;
            }
            if (tempCount == count && result > middle) {
                result = middle;
            }
            if (tempCount <= count) {
                end = middle - 1;
            }
            if (tempCount > count) {
                start = middle + 1;
            }
        }
        System.out.println(result);
    }
}
