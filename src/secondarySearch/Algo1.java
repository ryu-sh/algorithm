package secondarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int[] array = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int findNumberCount = scanner.nextInt();

        for (int i = 0; i < findNumberCount; i++) {
            int findNumber = scanner.nextInt();
            int start = 0;
            int end = inputNumber - 1;
            boolean isSearched = false;
            while (start <= end) {
                int middle = (start + end) / 2;
                if (findNumber == array[middle]) {
                    System.out.println(1);
                    isSearched = true;
                    break;
                }
                if (findNumber < array[middle]) {
                    end = middle - 1;
                }
                if (findNumber > array[middle]) {
                    start = middle + 1;
                }
            }
            if (!isSearched) {
                System.out.println(0);
            }
        }
    }
}
