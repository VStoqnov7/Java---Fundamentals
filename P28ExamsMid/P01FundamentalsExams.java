package P28ExamsMid;

import java.util.Scanner;

public class P01FundamentalsExams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;


        while (!input.equals("special")) {
            if (input.equals("regular")){
                break;
            }

            double number = Double.parseDouble((input));

            if (number < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }

            sum += number;


            input = scanner.nextLine();
        }
        double realSum = sum;
        double taxes = sum * 0.20;
        sum = sum + taxes;

        if (input.equals("special")) {
            sum = sum - sum * 0.10;

        }
        if (sum == 0){
            System.out.println("Invalid order!");
            return;
        }


        System.out.printf("Congratulations you've just bought a new computer!%n" +
                "Price without taxes: %.2f$%n" +
                "Taxes: %.2f$%n" +
                "-----------%n" +
                "Total price: %.2f$",realSum,taxes,sum);


    }
}
