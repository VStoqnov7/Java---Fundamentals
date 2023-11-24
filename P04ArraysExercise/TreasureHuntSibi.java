package P04ArraysExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TreasureHuntSibi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> chest = new ArrayList<>();

        String[] items = scanner.nextLine().split("\\|");
        for (String item : items) {
            chest.add(item);
        }

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        String loot = tokens[i];
                        if (!chest.contains(loot)) {
                            chest.add(0, loot);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < chest.size()) {
                        String removedItem = chest.remove(index);
                        chest.add(removedItem);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    if (count > chest.size()) {
                        count = chest.size();
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i = chest.size() - count; i < chest.size(); i++) {
                        sb.append(chest.get(i));
                        if (i < chest.size() - 1) {
                            sb.append(", ");
                        }
                    }
                    System.out.println(sb.toString());
                    for (int i = 0; i < count; i++) {
                        chest.remove(chest.size() - 1);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (chest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int totalLength = 0;
            for (String item : chest) {
                totalLength += item.length();
            }
            double averageGain = (double) totalLength / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        }
    }
}