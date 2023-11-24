package P10BasicSyntax;

import java.util.Scanner;

public class P11MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());

        if (num <= 10) {
            while (num <= 10) {
                int product = n * num;

                System.out.printf("%d X %d = %d%n", n, num, product);

                num++;
            }

        }else {
            int product = n * num;
            System.out.printf("%d X %d = %d%n", n, num, product);


        }


    }
}






