package P31egularMidExam;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(", ");
        int number = Integer.parseInt(scanner.nextLine());
        String item = scanner.nextLine();

        int[] items = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            items[i] = Integer.parseInt(input[i]);
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < items.length; i++) {
            if (i < number) {
                if (item.equals("cheap") && items[i] < items[number]) {
                    left += items[i];
                } else if (item.equals("expensive") && items[i] >= items[number]) {
                    left += items[i];
                }
            } else if (i > number) {
                if (item.equals("cheap") && items[i] < items[number]) {
                    right += items[i];
                } else if (item.equals("expensive") && items[i] >= items[number]) {
                    right += items[i];
                }
            }
        }

        if (left >= right) {
            System.out.println("Left - " + left);
        } else {
            System.out.println("Right - " + right);
        }
    }
}