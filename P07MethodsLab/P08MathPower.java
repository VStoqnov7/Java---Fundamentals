package P07MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        double num1 = Double.parseDouble(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        double calculation = result(num1,num2);


        System.out.println(df.format(calculation));



    }
    public static double result(double num1, int power){

        double result = Math.pow(num1,power);

        return result;


    }
}