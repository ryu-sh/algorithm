package bfs;

import java.util.*;

public class Algo1 {
    static ArrayList<Integer>[] lists;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeNumber = scanner.nextInt();
        int edgeNumber = scanner.nextInt();
        int startNumber = scanner.nextInt();
        lists = new ArrayList[nodeNumber + 1];
        dfsVisited = new boolean[nodeNumber + 1];
        bfsVisited = new boolean[nodeNumber + 1];

        for (int i = 0; i <= nodeNumber; i++) {
            lists[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edgeNumber; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            lists[first].add(second);
            lists[second].add(first);
        }

        for (int i = 0; i < nodeNumber; i++) {
            Collections.sort(lists[i]);
        }

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push(startNumber);
        queue.add(startNumber);

        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            if (!dfsVisited[node]) {
                dfsVisited[node] = true;
                System.out.print(node + " ");
            }
            for (int i = lists[node].size() - 1; i >= 0; i--) {
                if (!dfsVisited[lists[node].get(i)]) {
                    stack.push(lists[node].get(i));
                }
            }
        }
        System.out.println();
        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            if (!bfsVisited[node]) {
                bfsVisited[node] = true;
                System.out.print(node + " ");
            }
            for (Integer connectedNode : lists[node]) {
                if (!bfsVisited[connectedNode]) {
                    queue.add(connectedNode);
                }
            }
        }
    }
}
