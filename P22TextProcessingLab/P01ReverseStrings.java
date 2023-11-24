package P22TextProcessingLab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        while (!text.equals("end")) {
            String reverseWord = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                char symbol = text.charAt(i);
                reverseWord = reverseWord + symbol;
            }

            System.out.printf("%s = %s%n", text, reverseWord);

            text = scanner.nextLine();
        }
    }
}