package P28ExamsMid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> splitList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {

            //Loot {item1} {item2}…{item}"
            //Drop {index}
            //Steal {count}
            String[] item = command.split(" ");

            switch (item[0]) {
                case "Loot":
                    for (int i = 1; i < item.length; i++) {
                        if (!splitList.contains(item[i])) {
                            splitList.add(0, item[i]);
                        }
                    }

                    break;
                case "Drop":
                    int position = Integer.parseInt(item[1]);
                    if (position >= 0 && position < splitList.size()) {
                        String positionOfIndex = splitList.get(position);
                        splitList.remove(position);
                        splitList.add(positionOfIndex);
                    }
                    break;
                case "Steal":
                    List<String> nameSteals = new ArrayList<>();
                    int number = Integer.parseInt(item[1]);
                    if (number >= 0 && number < splitList.size()) {
                        for (int i = splitList.size() - number; i < splitList.size(); i++) {
                            nameSteals.add(splitList.get(i));
                            splitList.remove(i--);
                        }
                    } else if (number > splitList.size() - 1) {
                        for (int i = 0; i < splitList.size(); i++) {
                            nameSteals.add(splitList.get(i));
                            splitList.remove(splitList.get(i--));
                        }
                    }

                    for (int i = 0; i < nameSteals.size(); i++) {
                        System.out.print(nameSteals.get(i));
                        if (i != nameSteals.size() - 1){
                            System.out.print(", ");
                        }

                    }

                    for (int i = 0; i < nameSteals.size(); i++) {
                        if (splitList.contains(nameSteals.get(i))) {
                            splitList.remove(nameSteals.get(i--));
                        }

                    }

                    System.out.println();

                    break;
            }


            command = scanner.nextLine();
        }


        if (splitList.isEmpty()) {
            System.out.println("Failed treasure hunt.");

        } else {
            double sum = 0;
            for (String item:splitList) {
                sum = sum + item.length();
            }

            double avgGain = sum / splitList.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",avgGain);


        }

//Накрая изведете средната печалба от съкровище, която е сумата от дължината на всички елементи от съкровището, разделена на броя на всички елементи в сандъка,
// форматиран до втория десетичен знак:
    }
}
