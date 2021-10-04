package test.tving;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,0,0,0},{0,0,0,1},{0,0,1,0},{0,1,1,0}}, 2));
        System.out.println(solution(new int[][]{{1,0,0},{0,0,1},{1,0,0}}, 2));
    }

    // NXN 배열 중 KXK 만큼의 커버되는 1의 숫자중 최대값
    public static int solution(int[][] office, int k) {
        int answer = -1;
        for (int i = 0; i <= office.length - k; i++) {
            for (int j = 0; j <= office[0].length - k; j++) {
                int temp = 0;
                for (int l = 0; l < k; l++) {
                    for (int m = 0; m < k; m++) {
                        if (office[i + l][j + m] == 1) {
                            temp ++;
                        }
                    }
                }
                answer = Math.max(answer, temp);
            }
        }
        return answer;
    }
}
