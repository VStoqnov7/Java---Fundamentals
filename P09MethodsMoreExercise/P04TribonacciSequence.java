package P09MethodsMoreExercise;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        printTribonacci(num);
    }

    public static void printTribonacci(int num) {


        int num1 = 1;
        int num2 = 1;
        int num3 = 2;

        System.out.print(num1);

        if (num > 1) {
            System.out.print(" " + num2);
        }

        if (num > 2) {
            System.out.print(" " + num3);
        }

        for (int i = 3; i < num; i++) {
            int trib = num1 + num2 + num3;
            System.out.print(" " + trib);
            num1 = num2;
            num2 = num3;
            num3 = trib;
        }
    }
}