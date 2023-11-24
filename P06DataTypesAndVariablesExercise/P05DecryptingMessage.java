package P06DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int symbol = Integer.parseInt(scanner.nextLine());

        int number = Integer.parseInt(scanner.nextLine());

        String name = "";
        double sum = 0;

        for (int i = 1; i <= number ; i++) {


            char symbols = scanner.nextLine().charAt(0);

            sum = symbol + (int) symbols;

            name += (char) sum;


        }
        System.out.println(name);


    }
}
