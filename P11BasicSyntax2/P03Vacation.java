package P11BasicSyntax2;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerPerson = 0;
        double totalPrice = 0;

        if (type.equals("Students") && day.equals("Friday")) {
            pricePerPerson = 8.45;
        } else if (type.equals("Students") && day.equals("Saturday")) {
            pricePerPerson = 9.80;
        } else if (type.equals("Students") && day.equals("Sunday")) {
            pricePerPerson = 10.46;
        } else if (type.equals("Business") && day.equals("Friday")) {
            pricePerPerson = 10.90;
        } else if (type.equals("Business") && day.equals("Saturday")) {
            pricePerPerson = 15.60;
        } else if (type.equals("Business") && day.equals("Sunday")) {
            pricePerPerson = 16;
        } else if (type.equals("Regular") && day.equals("Friday")) {
            pricePerPerson = 15;
        } else if (type.equals("Regular") && day.equals("Saturday")) {
            pricePerPerson = 20;
        } else if (type.equals("Regular") && day.equals("Sunday")) {
            pricePerPerson = 22.50;
        }
        totalPrice = people * pricePerPerson;
        if (type.equals("Students") && people >= 30) {
            totalPrice = totalPrice * 0.85;
        } else if (type.equals("Business") && people >= 100) {
            totalPrice = totalPrice - (pricePerPerson * 10);
        } else if (type.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);


    }
}
