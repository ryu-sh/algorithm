package naver;

public class Test3 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,2,3,7},2,2)==7);;
        System.out.println(solution(new int[]{10,3,4,7},2,3)==17);;
        System.out.println(solution(new int[]{4,2,5,4,3,5,1,4,2,7},3,2)==6);;
    }

    // x개 선택 y일 간격 중 최소 값 출력  
    public static int solution(int[] A, int X, int Y) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A.length-(Y*(X-1)); i++) {
            int sum = 0;
            int startIndex = 0;
            for (int j = 0; j < X; j++) {
                sum += A[i+startIndex];
                startIndex += Y;
            }
            min = Math.min(min, sum);
        }

        return min;
    }
}
