package stack;

import java.util.Scanner;
import java.util.Stack;

public class Algo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        solution(array);
    }

    private static int[] solution(int[] array) {
        int[] result = new int[array.length];
        Stack<Integer> stack = new Stack<>();

        for (int index = 0; index < result.length; index++) {
            if (stack.isEmpty()) {
                stack.push(index);
            }
            else {
                while (!stack.isEmpty() && array[stack.peek()] < array[index]) {
                    result[stack.pop()] = array[index];
                }
                stack.push(index);
            }
        }
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        return result;
    }
}
