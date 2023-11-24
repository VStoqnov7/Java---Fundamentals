package P07MethodsLab;

import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printNumberSing(number);


    }

    public static void printNumberSing(int num){
        String singWord = "";
        if (num < 0){
            singWord = "negative";

        }else if (num > 0){
            singWord = "positive";

        }else {
            singWord = "zero";
        }
        System.out.printf("The number %d is %s.%n",num,singWord);

    }



}
