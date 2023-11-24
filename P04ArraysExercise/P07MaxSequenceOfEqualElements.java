package P04ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int start = 0;
        int currentSeqLength = 1;
        int currentSeqStart = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentSeqLength++;

                if (currentSeqLength > length) {
                    length = currentSeqLength;
                    start = currentSeqStart;
                }
            } else {
                currentSeqLength = 1;
                currentSeqStart = i;
            }
        }

        for (int i = start; i < start + length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}