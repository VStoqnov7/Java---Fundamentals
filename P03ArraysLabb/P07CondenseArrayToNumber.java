package P03ArraysLabb;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        //2 10 3

        int secondNum = 0;


        for (int i = 0; i < numbersArr.length - 1; i++) {
            for (int j = 0; j < numbersArr.length - 1; j++) {
                numbersArr[j] = numbersArr[j] + numbersArr[j + 1];
            }
            secondNum = numbersArr[0];

        }

        if (numbersArr.length < 2) {
            System.out.println(numbersArr[0]);
        } else {
            System.out.println(secondNum);
        }
    }
}
