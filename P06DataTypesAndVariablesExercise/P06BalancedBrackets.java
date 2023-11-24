package P06DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long openCount = 0;
        long closeCount = 0;

        for (int i = 1; i <= n; i++) {
            String symbol = scanner.nextLine();

            if (symbol.equals("(")) {
                openCount++;

            } else if (symbol.equals(")")) {
                closeCount++;
                if (openCount - closeCount != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if (openCount == closeCount) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}