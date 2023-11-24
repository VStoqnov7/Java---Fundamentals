package P12BasicSyntax2MoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumHave = Double.parseDouble(scanner.nextLine());

        String name = scanner.nextLine();
        double money = 0;


        while (!name.equals("Game Time")){

            switch (name){
                case "OutFall 4":
                    if (sumHave < 39.99){
                        System.out.println("Too Expensive");
                        name = scanner.nextLine();
                        continue;
                    }
                    sumHave -= 39.99;
                    money += 39.99;
                    System.out.printf("Bought %s%n",name);
                    break;
                case "CS: OG":
                    if (sumHave < 15.99) {
                        System.out.println("Too Expensive");
                        name = scanner.nextLine();
                        continue;
                    }
                    sumHave -= 15.99;
                    money += 15.99;
                    System.out.printf("Bought %s%n",name);
                    break;
                case "Zplinter Zell":
                    if (sumHave < 19.99) {
                        System.out.println("Too Expensive");
                        name = scanner.nextLine();
                        continue;
                    }
                    sumHave -= 19.99;
                    money += 19.99;
                    System.out.printf("Bought %s%n",name);
                    break;
                case "Honored 2":
                    if (sumHave < 59.99) {
                        System.out.println("Too Expensive");
                        name = scanner.nextLine();
                        continue;
                    }
                    sumHave -= 59.99;
                    money += 59.99;
                    System.out.printf("Bought %s%n",name);
                    break;
                case "RoverWatch":
                    if (sumHave < 29.99) {
                        System.out.println("Too Expensive");
                        name = scanner.nextLine();
                        continue;
                    }
                    sumHave -= 29.99;
                    money += 29.99;
                    System.out.printf("Bought %s%n",name);
                    break;
                case "RoverWatch Origins Edition":
                    if (sumHave < 39.99) {
                        System.out.println("Too Expensive");
                        name = scanner.nextLine();
                        continue;
                    }
                    sumHave = sumHave - 39.99;
                    money += 39.99;
                    System.out.printf("Bought %s%n",name);
                    break;
                default:
                    System.out.println("Not Found");

            }

            if (sumHave == 0){
                System.out.println("Out of money!");
                break;
            }





            name = scanner.nextLine();

        }


        if (name.equals("Game Time")){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",money,sumHave);
        }







    }
}
