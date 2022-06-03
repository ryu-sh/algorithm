package bfs;

import java.util.*;

public class Algo3 {
    static List<Edge>[] lists;
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeCount = scanner.nextInt();
        lists = new List[nodeCount + 1];
        visited = new boolean[nodeCount + 1];
        distance = new int[nodeCount + 1];

        for (int i = 1; i <= nodeCount; i++) {
            int nodeNumber = scanner.nextInt();
            lists[nodeNumber] = new ArrayList<>();
            while (true) {
                int first = scanner.nextInt();
                if (first == -1) {
                    break;
                }
                int second = scanner.nextInt();
                lists[i].add(new Edge(first, second));
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        visited[2] = true;

        bfs(queue);
        int tempNodeNumber = findTempNode();
        visited = new boolean[nodeCount + 1];
        distance = new int[nodeCount + 1];

        queue.add(tempNodeNumber);
        visited[tempNodeNumber] = true;
        bfs(queue);

        System.out.println(distance[findTempNode()]);
    }

    private static int findTempNode() {
        int maxDistance = 0;
        int tempNodeNumber = 0;
        for (int i = 0; i < distance.length; i++) {
            if (maxDistance <= distance[i]) {
                maxDistance = distance[i];
                tempNodeNumber = i;
            }
        }
        return tempNodeNumber;
    }

    private static void bfs(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            Integer nodeNumber = queue.poll();
            for (Edge edge : lists[nodeNumber]) {
                if (visited[edge.value]) {
                    continue;
                }
                queue.add(edge.value);
                visited[edge.value] = true;
                distance[edge.value] = distance[nodeNumber] + edge.distance;
            }
        }
    }

    static class Edge {
        int value;
        int distance;

        public Edge(int value, int distance) {
            this.value = value;
            this.distance = distance;
        }
    }
}
