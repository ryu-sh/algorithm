package dfs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/13023
public class Algo3 {
    static ArrayList<Integer>[] arrayLists;
    static boolean[] visited;
    static boolean isEnd = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeSize = scanner.nextInt();
        int edgeSize = scanner.nextInt();
        arrayLists = new ArrayList[nodeSize];
        visited = new boolean[nodeSize];

        for (int i = 0; i < nodeSize; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        for (int i = 0; i < edgeSize; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            arrayLists[first].add(second);
            arrayLists[second].add(first);
        }

        for (int i = 0; i < nodeSize; i++) {
            dfs(i, 1);
            if (isEnd) {
                break;
            }
        }
        if (isEnd) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
    static void dfs(int nodeNumber, int depth) {
        if (depth == 5) {
            isEnd = true;
            return;
        }
        visited[nodeNumber] = true;
        for (Integer node : arrayLists[nodeNumber]) {
            if (!visited[node]) {
                dfs(node, depth + 1);
            }
        }
        visited[nodeNumber] = false;
    }
}
