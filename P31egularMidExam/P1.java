package P31egularMidExam;


import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;


        for (int i = 1; i <= n; i++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            double profit = income - expenses;
            if (i % 3 == 0 && i % 5 != 0 ) {
                profit -= expenses * 0.50;
            }

            if (i % 5 == 0) {
                profit -= income * 0.10;
            }

            totalProfit += profit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
        }



        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}