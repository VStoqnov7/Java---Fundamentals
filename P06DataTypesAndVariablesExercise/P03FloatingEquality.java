package P06DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double eps = 0.000001;
        double n1 = 0.0;
        double n2 = 0.0;

         while (true) {
        n1 = Double.parseDouble(scanner.next());
        n2 = Double.parseDouble(scanner.next());
        boolean isEqual = Math.abs(n1 - n2) < eps;

        if (isEqual) {
            System.out.println("True");
            return;
        } else {
            System.out.println("False");
            return;
        }
         }
    }
}