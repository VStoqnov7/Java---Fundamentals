package P04ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "swap":
                    int number1 = Integer.parseInt(commandParts[1]);
                    int number2 = Integer.parseInt(commandParts[2]);
                    if (number1 >= 0 && number1 < array.length && number2 >= 0 && number2 < array.length) {
                        int numberCommand1 = array[number1];
                        int numberCommand2 = array[number2];
                        array[number1] = numberCommand2;
                        array[number2] = numberCommand1;
                    }
                    break;
                case "multiply":
                    int numbers1 = Integer.parseInt(commandParts[1]);
                    int numbers2 = Integer.parseInt(commandParts[2]);
                    if (numbers1 >= 0 && numbers1 < array.length && numbers2 >= 0 && numbers2 < array.length) {
                        int numberCommands1 = array[numbers1];
                        int numberCommands2 = array[numbers2];
                        int sumsMultiply = 0;
                        sumsMultiply = numberCommands1 * numberCommands2;
                        array[numbers1] = sumsMultiply;
                    }
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        int temp = array[i] - 1;
                        array[i] = temp;
                    }
                    break;
            }
            input = scanner.nextLine();

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }


        }
    }
}