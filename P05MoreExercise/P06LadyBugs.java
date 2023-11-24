package P05MoreExercise;

import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int fieldSize = scanner.nextInt();
        scanner.nextLine();


        int[] field = new int[fieldSize];
        for (int i = 0; i < fieldSize; i++) {
            field[i] = 0;
        }


        String[] initialIndexes = scanner.nextLine().split(" ");
        for (String index : initialIndexes) {
            int i = Integer.parseInt(index);
            if (i >= 0 && i < fieldSize) {
                field[i] = 1;
            }
        }


        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            int ladybugIndex = Integer.parseInt(commandArray[0]);
            String direction = commandArray[1];
            int flyLength = Integer.parseInt(commandArray[2]);


            if (ladybugIndex >= 0 && ladybugIndex < fieldSize && field[ladybugIndex] == 1) {
                field[ladybugIndex] = 0;


                if (direction.equals("right")) {
                    int newIndex = ladybugIndex + flyLength;
                    while (newIndex >= 0 && newIndex < fieldSize) {
                        if (field[newIndex] == 0) {
                            field[newIndex] = 1;
                            break;
                        } else {
                            newIndex += flyLength;
                        }
                    }
                } else if (direction.equals("left")) {
                    int newIndex = ladybugIndex - flyLength;
                    while (newIndex >= 0 && newIndex < fieldSize) {
                        if (field[newIndex] == 0) {
                            field[newIndex] = 1;
                            break;
                        } else {
                            newIndex -= flyLength;
                        }
                    }
                }
            }

            command = scanner.nextLine();
        }


        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}