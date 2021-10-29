package test.naver2;

public class Algo1 {
    public static void main(String[] args) {
        Algo1 algo1 = new Algo1();
        System.out.println(algo1.solution(new int[]{0,1,2,3,4,5,6,7}));
    }

    public String solution(int[] T) {
        // write your code in Java SE 8
        int length = T.length / 4;
        int[] answers = new int[4];
        int temp = 0;
        for (int i = 0; i < length - 1; i++) {
            int amplitude = Math.abs(T[i] - T[i + 1]);
            temp = Math.max(temp, amplitude);
        }
        answers[0] = temp;
        temp = 0;
        for (int i = length; i < length * 2 - 1; i++) {
            int amplitude = Math.abs(T[i] - T[i + 1]);
            temp = Math.max(temp, amplitude);
        }
        answers[1] = temp;
        temp = 0;
        for (int i = length * 2 ; i < length * 3 - 1; i++) {
            int amplitude = Math.abs(T[i] - T[i + 1]);
            temp = Math.max(temp, amplitude);
        }
        answers[2] = temp;
        temp = 0;
        for (int i = length * 3; i < T.length - 1; i++) {
            int amplitude = Math.abs(T[i] - T[i + 1]);
            temp = Math.max(temp, amplitude);
        }
        answers[3] = temp;
        int maxIndex = 0;
        int answer = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answer < answers[i]) {
                answer = answers[i];
                maxIndex = i;
            }
        }
        switch (maxIndex) {
            case 0 : return "WINTER";
            case 1 : return "SPRING";
            case 2 : return "SUMMER";
            case 3 : return "AUTUMN";
            default: return null;
        }
    }
}
