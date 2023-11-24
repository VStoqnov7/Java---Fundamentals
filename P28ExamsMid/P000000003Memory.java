package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P000000003Memory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        String command = scanner.nextLine();
        int moves = 0;

        while (!command.equals("end")) {

            List<String> listCommand = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            moves++;

            int input1 = Integer.parseInt(listCommand.get(0));
            int input2 = Integer.parseInt(listCommand.get(1));

            if (input1 >= 0 && input1 < firstList.size() && input2 >= 0 && input2 < firstList.size() && input1 != input2) {
                if (firstList.get(input1).equals(firstList.get(input2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstList.get(input1));
                    firstList.remove(Math.max(input1,input2));
                    firstList.remove(Math.min(input1,input2));

                } else {
                    System.out.println("Try again!");

                }


            } else {
                int middle = firstList.size() / 2;
                firstList.add(middle, "-" + moves + "a");
                firstList.add(middle, "-" + moves + "a");

                System.out.println("Invalid input! Adding additional elements to the board");

            }

            if (firstList.isEmpty()){
                System.out.printf("You have won in %d turns!",moves);
                return;


            }

            command = scanner.nextLine();
        }

        System.out.println("Sorry you lose :(");

        for (String item : firstList) {
            System.out.print(item + " ");

        }







    }
}
