package P11BasicSyntax2;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= n ; i++) {

        double capsule = Double.parseDouble(scanner.nextLine());

        int day = Integer.parseInt(scanner.nextLine());

        int numberCapsule = Integer.parseInt(scanner.nextLine());




        double totalPrice = (day * numberCapsule) * capsule;

        sum += totalPrice;

            System.out.printf("The price for the coffee is: $%.2f%n",totalPrice);




        }

        System.out.printf("Total: $%.2f",sum);


    }
}
