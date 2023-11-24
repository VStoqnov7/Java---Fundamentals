package P07MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");
        double results = result(number);

        System.out.print(df.format(results));


    }

    public static double result(int num) {
        int sum1 = 0;
        int sum2 = 0;
        int sumOfNumber = 0;
        num = Math.abs(num);


        while (num > 0) {
            sumOfNumber = num % 10;

            if (sumOfNumber % 2 == 0) {
                sum1 += sumOfNumber;
            } else {
                sum2 += sumOfNumber;
            }

            num = num / 10;


        }


        int results = sum1 * sum2;
        return results;


    }


}
