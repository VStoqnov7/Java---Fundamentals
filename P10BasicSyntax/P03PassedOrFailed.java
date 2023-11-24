package P10BasicSyntax;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double number = Double.parseDouble(scanner.nextLine());


        if (number < 3.00){
            System.out.println("Failed!");
        }else {
            System.out.println("Passed!");
        }
    }
}
