package P28ExamsMid;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int energy = Integer.parseInt(scanner.nextLine());


        String command = scanner.nextLine();
        int wonBattles = 0;

        while (!command.equals("End of battle")){


            int enemy = Integer.parseInt(command);

            if (enemy <= energy){
                energy -= enemy;
                wonBattles++;
                if (wonBattles % 3 == 0){
                    energy += wonBattles;
                }
            }else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wonBattles,energy);
                return;

            }

            command = scanner.nextLine();
        }




        System.out.printf("Won battles: %d. Energy left: %d",wonBattles,energy);





    }
}
