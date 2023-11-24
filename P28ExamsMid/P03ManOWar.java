package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> warShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());


        String command = scanner.nextLine();

        while (!command.contains("Retire")){

            String[] input = command.split(" ");

            switch (input[0]){
                case "Fire":
                    //Fire {index} {damage}"
                    int input1Index = Integer.parseInt(input[1]);
                    int input2Damage = Integer.parseInt(input[2]);

                    if (input1Index >= 0 && input1Index <= warShip.size()){
                        int position = warShip.get(input1Index);
                        warShip.set(input1Index,position - input2Damage);
                        if (warShip.get(input1Index) <= 0){
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }

                    }

                    break;
                case "Defend":
                    //Defend {startIndex} {endIndex} {damage}"
                    int input1Start = Integer.parseInt(input[1]);
                    int input2End = Integer.parseInt(input[2]);
                    int input3Damage = Integer.parseInt(input[3]);

                    if (input1Start >= 0 && input2End >= 0 && input1Start < pirateShip.size()  && input2End < pirateShip.size()){
                        for (int i = input1Start; i <= input2End ; i++) {
                            pirateShip.set(i,pirateShip.get(i) - input3Damage);
                            if (pirateShip.get(i) <= 0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;

                            }
                        }
                    }
                    break;
                case "Repair":
                    //Repair {index} {health}"
                    int input1Index1 = Integer.parseInt(input[1]);
                    int health = Integer.parseInt(input[2]);

                    if (input1Index1 >= 0 && input1Index1 < pirateShip.size()){
                        if (pirateShip.get(input1Index1) + health <= capacity){
                            pirateShip.set(input1Index1,pirateShip.get(input1Index1) + health);
                        }else {
                            pirateShip.set(input1Index1,capacity);
                        }
                    }
                    break;
                case "Status":
                    //"Status"
                        int count = 0;
                        double sections = capacity * 0.20;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        if (pirateShip.get(i) < sections){
                            count++;
                        }
                    }

                    System.out.printf("%d sections need repair.%n",count );

                    break;

            }

            command = scanner.nextLine();
        }

        int sumWar = 0;
        int sumPirate = 0;

        for (Integer war : warShip) {
            sumWar += war;


        }

        for (Integer pirate : pirateShip) {
            sumPirate += pirate;

        }

        System.out.printf("Pirate ship status: %d%n",sumPirate);
        System.out.printf("Warship status: %d%n",sumWar);

    }
}
