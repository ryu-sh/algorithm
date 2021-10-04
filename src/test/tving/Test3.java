package test.tving;

public class Test3 {
    public static void main(String[] args) {
        // 1,1
        // 2,2
        // 3,3
        System.out.println(solution(2));
    }

    // N 명이 탁자에 앉아서 악수
    public static int solution(int N) {
        int answer = 0;
        int max = N*2;
        int[] shakable = {1, -1, N, -N};
        boolean[][] isShakable = new boolean[max+1][max+1];

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                for (int k = 0; k < shakable.length; k++) {
                    int tempNumber = i + shakable[k];
                    if (tempNumber > 0 && tempNumber <= max) {
                        isShakable[i][tempNumber] = true;
                        isShakable[tempNumber][i] = true;
                    }
                }
            }
        }

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j < max; j++) {
                if (isShakable[i][j]) {
                    isShakable[i][j] = false;
                    isShakable[j][i] = false;
//                    temp++;
                    break;
                }
            }
        }

        return answer;
    }
}
