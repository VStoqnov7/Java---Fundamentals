package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P0000010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String command = scanner.nextLine();

        while (!command.equals("Retire")) {


            List<String> name = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            switch (name.get(0)) {
                case "Fire":
                    int index = Integer.parseInt(name.get(1));
                    int damage = Integer.parseInt(name.get(2));

                    if (index >= 0 && index < warShip.size()) {
                        warShip.set(index, warShip.get(index) - damage);
                        if (warShip.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;

                        }
                    }
                    break;
                case "Defend":
                    //Defend {startIndex} {endIndex} {damage}
                    int indexStartPirate = Integer.parseInt(name.get(1));
                    int indexEndPirate = Integer.parseInt(name.get(2));
                    int damagePirate = Integer.parseInt(name.get(3));

                    if (indexStartPirate >= 0 && indexStartPirate < pirateShip.size() && indexEndPirate >= 0 && indexEndPirate < pirateShip.size()) {
                        for (int i = indexStartPirate; i <= indexEndPirate; i++) {
                            pirateShip.set(i, pirateShip.get(i) - damagePirate);
                            if (pirateShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    //Repair {index} {health}
                    int indexPirateDamage = Integer.parseInt(name.get(1));
                    int pirateHealth = Integer.parseInt(name.get(2));

                    if (indexPirateDamage >= 0 && indexPirateDamage < pirateShip.size()) {
                        if (pirateShip.get(indexPirateDamage) + pirateHealth <= maxCapacity) {
                            pirateShip.set(indexPirateDamage, pirateShip.get(indexPirateDamage) + pirateHealth);

                        } else {
                            pirateShip.set(indexPirateDamage, maxCapacity);
                        }

                    }

                    break;
                case "Status":
                    int number = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        double percent = maxCapacity * 0.20;
                        if (pirateShip.get(i) < percent){
                            number++;
                        }
                    }

                    System.out.printf("%d sections need repair.%n",number);




                    break;


            }


            command = scanner.nextLine();
        }

        int sumPirate = 0;
        int sumWar = 0;



        for (Integer pirate : pirateShip) {
            sumPirate += pirate;

            
        }
        for (Integer war : warShip) {
            sumWar += war;

        }

        System.out.printf("Pirate ship status: %d%n",sumPirate);
        System.out.printf("Warship status: %d",sumWar);




    }
}
