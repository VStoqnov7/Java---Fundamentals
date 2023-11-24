package P28ExamsMid;

import java.util.Scanner;


public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] targets = new int[input.length];
        for (int i = 0; i < targets.length; i++) {
            targets[i] = Integer.parseInt(input[i]);
        }

        String command = scanner.nextLine();
        int shotTargetsCount = 0;
        while (!command.equals("End")) {
            int targetIndex = Integer.parseInt(command);
            if (targetIndex >= 0 && targetIndex < targets.length) {
                shotTargetsCount++;
                int targetValue = targets[targetIndex];
                targets[targetIndex] = -1;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] > 0) {
                        if (targets[i] > targetValue) {
                            targets[i] -= targetValue;
                        } else if (targets[i] <= targetValue) {
                            targets[i] += targetValue;
                        }
                    }
                }

            }
            command = scanner.nextLine();
        }

        System.out.print("Shot targets: " + shotTargetsCount + " -> ");
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i] + " ");
        }
    }
}