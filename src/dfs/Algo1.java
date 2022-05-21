package dfs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/11724
public class Algo1 {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();

        arrayList = new ArrayList[nodeCount + 1];
        visited = new boolean[nodeCount + 1];

        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }

        for (int i = 0; i < edgeCount; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            arrayList[first].add(second);
            arrayList[second].add(first);
        }
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 1; i < nodeCount + 1; i++) {
            if (!visited[i]) {
                visited[i] = true;
                stack.push(i);
                result ++;
            }
            while (!stack.isEmpty()) {
                ArrayList<Integer> nodeList = arrayList[stack.pop()];
                for (Integer node : nodeList) {
                    if (!visited[node]) {
                        visited[node] = true;
                        stack.push(node);
                    }
                }
            }
        }
        System.out.println("result = " + result);
    }

    static void dfs(int node) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        for (Integer arrayNumber : arrayList[node]) {
            dfs(arrayNumber);
        }
    }
}
