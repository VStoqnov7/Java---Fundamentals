package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        int sum = 0;

        for (int i = 1; i <= number ; i++) {

            int liters = Integer.parseInt(scanner.nextLine());


            sum += liters;

            if (sum > 255){
                System.out.println("Insufficient capacity!");
                sum -= liters;
            }


        }


        System.out.println(sum);

    }
}
