package array;

import java.util.Scanner;

public class Algo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] aArray = new int[number];
        int[] bArray = new int[number];
        for (int i = 0; i < number; i++) {
            aArray[i] = in.nextInt();
        }
        for (int i = 0; i < number; i++) {
            bArray[i] = in.nextInt();
        }

        String[] results = solution(aArray, bArray);

        for (String result : results) {
            System.out.println(result);
        }
    }

    private static String[] solution(int[] aArray, int[] bArray) {
        String[] results = new String[aArray.length];

        for (int i = 0; i < aArray.length; i++) {
            results[i] = fight(aArray[i], bArray[i]);
        }

        return results;
    }

    private static String fight(int a, int b) {

        switch (a) {
            case 1 :
                switch (b) {
                    case 1 :
                        return "D";
                    case 2 :
                        return "B";
                    case 3 :
                        return "A";
                }
            case 2 :
                switch (b) {
                    case 1 :
                        return "A";
                    case 2 :
                        return "D";
                    case 3 :
                        return "B";
                }
            case 3 :
                switch (b) {
                    case 1 :
                        return "B";
                    case 2 :
                        return "A";
                    case 3 :
                        return "D";
                }
        }
        return null;
    }

    private static String fight2(int a, int b) {
        if (a == b) {
            return "D";
        }
        if (a == 1 && b == 3) {
            return "A";
        }
        else if (a == 2 && b == 1) {
            return "A";
        }
        else if (a == 3 && b == 2) {
            return "A";
        }
        else {
            return "B";
        }
    }
}
