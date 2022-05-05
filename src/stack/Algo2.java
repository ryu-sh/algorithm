package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= number; i--) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
    }
}
