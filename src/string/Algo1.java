package string;

import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args){
        System.out.println("???");
        Scanner in=new Scanner(System.in);
        String inputString = in.next();
        char inputCharacter = in.next().charAt(0);

        System.out.println(solution(inputString, inputCharacter));
        return ;
    }

    public static int solution(String inputString, char inputCharacter) {
        int result = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.toLowerCase().charAt(i) == Character.toLowerCase(inputCharacter)) {
                result++;
            }
        }
        return result;
    }
}
