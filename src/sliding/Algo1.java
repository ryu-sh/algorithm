package sliding;

import java.util.*;

public class Algo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int windowSize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        solution(array, windowSize);
    }

    private static List solution(int[] array, int windowSize) {
        Deque<Node> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int now = array[i];

            while (!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }
            deque.addLast(new Node(now, i));
            if (deque.getFirst().index <= i - windowSize) {
                deque.removeFirst();
            }
            result.add(deque.getFirst().value);
        }
        return result;
    }

    static class Node {
        public int value;
        public int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
