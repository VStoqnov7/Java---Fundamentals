package P28ExamsMid;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        int[] wagons = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (people > 0) {
            boolean placed = false;
            for (int i = 0; i < wagons.length; i++) {
                if (wagons[i] < 4) {
                    wagons[i]++;
                    people--;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                break;
            }
        }

        if (people == 0) {
            boolean empty = false;
            for (int i = 0; i < wagons.length; i++) {
                if (wagons[i] < 4) {
                    empty = true;
                    break;
                }
            }
            if (empty) {
                System.out.print("The lift has empty spots!\n");
            }
            for (int i = 0; i < wagons.length; i++) {
                System.out.print(wagons[i] + " ");
            }
        } else {
            System.out.print("There isn't enough space! " + people + " people in a queue!\n");
            for (int i = 0; i < wagons.length; i++) {
                System.out.print(wagons[i] + " ");
            }
        }
        System.out.println();
        scan.close();
    }
}
//
//        int number = Integer.parseInt(scanner.nextLine());
//
//        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        boolean isValid = true;
//
//        for (int i = 0; i < num.length; i++) {
//
//
//            if (num[i] >= 0 && num[i] <= 4) {
//
//                if (num[i] == 0) {
//                    if (number > 3) {
//                        number = number - 4;
//                        num[i] = num[i] + 4;
//                    } else if (number > 2) {
//                        number = number - 3;
//                        num[i] = num[i] + 3;
//                    } else if (number > 1) {
//                        number = number - 2;
//                        num[i] = num[i] + 2;
//                    } else if (number > 0) {
//                        number = number - 1;
//                        num[i] = num[i] + 1;
//                    }
//
//                } else if (num[i] == 1) {
//                    if (number > 2) {
//                        number = number - 3;
//                        num[i] = num[i] + 3;
//                    } else if (number > 1) {
//                        number = number - 2;
//                        num[i] = num[i] + 2;
//                    } else if (number > 0) {
//                        number = number - 1;
//                        num[i] = num[i] + 1;
//                    }
//
//
//                } else if (num[i] == 2) {
//                    if (number > 1) {
//                        number = number - 2;
//                        num[i] = num[i] + 2;
//
//                    } else if (number > 0) {
//                        number = number - 1;
//                        num[i] = num[i] + 1;
//                    }
//
//
//                } else if (num[i] == 3) {
//                    if (number > 0) {
//                        number = number - 1;
//                        num[i] = num[i] + 1;
//                    }
//                }
//
//
//            }
//
//        }/////for
//
//
//        for (int index : num) {
//
//            if (index < 4) {
//                System.out.println("The lift has empty spots!");
//                isValid = false;
//                break;
//            }
//
//
//        }
//
//
//        if (num[num.length - 1] == 4 && number == 0) {
//            isValid = false;
//        }
//
//
//
//        if (isValid){
//            System.out.printf("There isn't enough space! %d people in a queue!%n", number);
//        }
//
//        for (int item : num) {
//            System.out.print(item + " ");
//
//        }
//
//
//    }
//}
