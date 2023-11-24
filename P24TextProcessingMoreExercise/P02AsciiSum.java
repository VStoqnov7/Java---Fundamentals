package P24TextProcessingMoreExercise;

import java.util.Scanner;

public class P02AsciiSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstSymbol = scanner.nextLine();
        String secondSymbol = scanner.nextLine();

        String name = scanner.nextLine();

        int sum = 0;

        int start = (int) firstSymbol.charAt(0);
        int end = (int) secondSymbol.charAt(0);

        for (int i = 0; i < name.length(); i++) {

            int num = name.charAt(i);

            if (num > start && num < end){
                sum += num;
            }

        }
            System.out.println(sum);
    }
}
