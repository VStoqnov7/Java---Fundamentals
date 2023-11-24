package P04ArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lootsChestArr = scanner.nextLine().split("\\|");
        List<String> chestList = new ArrayList<>(Arrays.asList(lootsChestArr));

        List<String> commandList = Arrays.asList(scanner.nextLine().split(" "));
        while (!"Yohoho!".equals(commandList.get(0))) {
            String command = commandList.get(0);

            switch (command) {
                case "Loot":
                    List<String> loots = commandList.subList(1, commandList.size());
                    for (String item:loots) {
                        if (!chestList.contains(item)) {
                            chestList.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandList.get(1));
                    if (index >= 0 && index < chestList.size()) {
                        String removedItem = chestList.get(index);
                        chestList.remove(removedItem);
                        chestList.add(removedItem);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandList.get(1));
                    int result = chestList.size() - count;
                    List<String> stealItems = new ArrayList<>();
                    if (result >= 0) {
                        for (int i = result; i < chestList.size(); i++) {
                            String item = chestList.remove(i--);
                            stealItems.add(item);
                        }
                    } else {
                        for (int i = 0; i < chestList.size(); i++) {
                            String item = chestList.remove(i--);
                            stealItems.add(item);
                        }
                    }

                    System.out.println(String.join(", ", stealItems));
                    break;
            }
            commandList = Arrays.asList(scanner.nextLine().split(" "));
        }

        if (chestList.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;
            for (String item:chestList) {
                sum = sum + item.length();
            }

            double avgGain = sum / chestList.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", avgGain);
        }
    }
}

//        String [] loots = scanner.nextLine().split("\\|");
//        //"Gold|Silver|Bronze|Medallion|Cup".split("|") -> ["Gold", "Silver", "Bronze", "Medallion", "Cup"]
//
//        String command = scanner.nextLine(); //цялата команда, въведена от конзолата
//
//        while (!command.equals("Yohoho!")) {
//            //command = "Loot {item1} {item2}…{itemn}".split -> ["Loot", "itrem1", "item2", ...]
//
//            //command = "Steal 2".split -> ["Steal", "2"]
//            String[] commandParts = command.split(" "); //частите на командата
//            String commandName = commandParts[0]; //име на команда: Loot, Drop, Steal
//
//            switch (commandName) {
//                case "Loot":
//                    break;
//                case "Drop":
//                    //command = "Drop 4".split -> commandParts = ["Drop", "4"]
//                    int dropIndex = Integer.parseInt(commandParts[1]); //"4" -> 4
//                    //проверка на индекс
//                    if(dropIndex < 0 || dropIndex >= loots.length - 1) {
//                        //невалиден индекс -> индекс, на който нямаме елемент
//                        break;
//                    } else{
//                        //валиден индекс
//                        //1. взимаме елемента за преместване
//                        String currentLoot = loots[dropIndex];
//                        //2. премествам на ляво всички елементи след моя
//                        for (int leftIndex = dropIndex; leftIndex < loots.length - 1; leftIndex++) {
//                            loots[leftIndex] = loots[leftIndex + 1];
//                        }
//                        //3. слагаме накрая елемента за преместване
//                        loots[loots.length - 1] = currentLoot;
//                    }
//                    break;
//                case "Steal":
//                    break;
//            }
//
//            command = scanner.nextLine();
//        }
//    }
//}
