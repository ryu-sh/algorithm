package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        char[][] map = new char[row][col];
        boolean[][] visited = new boolean[row][col];
        int[][] depthMap = new int[row][col];

        for (int i = 0; i < row; i++) {
            String mapRow = scanner.next();
            for (int j = 0; j < mapRow.length(); j++) {
                map[i][j] = mapRow.charAt(j);
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        depthMap[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextRow = now[0] + dx[i];
                int nextCol = now[1] + dy[i];
                if (nextRow >= 0 && nextCol >= 0 && nextRow < row && nextCol < col) {
                    if (map[nextRow][nextCol] != '0' && !visited[nextRow][nextCol]) {
                        queue.offer(new int[]{nextRow, nextCol});
                        visited[nextRow][nextCol] = true;
                        depthMap[nextRow][nextCol] = depthMap[now[0]][now[1]] + 1;
                    }
                }

            }
        }
        System.out.println(depthMap[row - 1][col - 1]);
    }
}
