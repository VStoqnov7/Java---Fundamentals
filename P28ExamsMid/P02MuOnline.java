package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());


        int health = 100;
        int bitcoins = 0;
        int room = 0;


        for (int i = 0; i < list.size(); i++) {

            String[] input = list.get(i).split(" ");
            String name = input[0];
            int number = Integer.parseInt(input[1]);


            if (name.equals("potion")) {

                if (health + number > 100) {
                    System.out.printf("You healed for %d hp.%n", Math.abs(100 - health));
                    health = 100;
                    System.out.printf("Current health: %d hp.%n", health);
                } else {
                    health += number;
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                }


            } else if (name.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);


            } else {

                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", name);

                } else {
                    room = i + 1;
                    System.out.printf("You died! Killed by %s.%n", name);
                    System.out.printf("Best room: %d%n", room);
                    return;


                }


            }


        }


        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);


    }
}
