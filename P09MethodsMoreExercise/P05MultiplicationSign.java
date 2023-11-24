package P09MethodsMoreExercise;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());


        int negativeCount = 0;

        if (num1 < 0) {
            negativeCount++;
        }

        if (num2 < 0) {
            negativeCount++;
        }

        if (num3 < 0) {
            negativeCount++;
        }

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if (negativeCount % 2 == 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
