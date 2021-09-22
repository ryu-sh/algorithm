package test.naver;

public class Test2 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{3,4,5,3,7}) == 3);
        System.out.println(solution(new int[]{1,3,1,2}) == 0);
        System.out.println(solution(new int[]{1,2,3,4}) == -1);
        System.out.println(solution(new int[]{1,5,7,3,8}) == 3);
//        System.out.println(solution(new int[]{1,3,1,2}) == 0);

    }

    public static int solution(int[] A) {
        int result = 0;
        if (isPerfect(A)) {
            return result;
        }
        // 하나의 나무 삭제 위한 반복문
        for (int i = 0; i < A.length; i++) {
            Boolean isGreater = null;
            int prev = 0;
            int finishFlag = 0;
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    continue;
                }
                if (prev == 0) {
                    prev = A[j];
                    finishFlag++;
                    continue;
                }
                if ((isGreater == null || isGreater == false) && prev < A[j]) {
                    isGreater = true;
                    finishFlag++;
                }
                else if ((isGreater == null || isGreater == true) && prev > A[j]) {
                    isGreater = false;
                    finishFlag ++;
                }
                prev = A[j];
            }
            if (finishFlag == A.length-1) {
                result++;
            }
        }

        if (result == 0) {
            return -1;
        }

        return result;
    }

    public static boolean isPerfect(int[] array) {
        int prev = array[0];
        Boolean isGreater = null;
        int finishFlag = 1;
        for (int j = 1; j < array.length; j++) {
            if ((isGreater == null || isGreater == false) && prev < array[j]) {
                isGreater = true;
                finishFlag++;
            }
            else if ((isGreater == null || isGreater == true) && prev > array[j]) {
                isGreater = false;
                finishFlag ++;
            }
            prev = array[j];
        }
        if (finishFlag == array.length) {
            return true;
        }
        return false;
    }
}
