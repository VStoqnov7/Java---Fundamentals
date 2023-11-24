package P04ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArr.length; i++) {
            boolean isItBigger = true;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] <= inputArr[j]) {
                    isItBigger = false;
                }
            }

            if (isItBigger) {
                System.out.print(inputArr[i] + " ");
            }
        }
    }
}
