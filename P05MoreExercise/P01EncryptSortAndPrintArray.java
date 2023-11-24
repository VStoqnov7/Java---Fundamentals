package P05MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] encryptedStrings = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int encryption = 0;
            for (int j = 0; j < name.length(); j++) {
                char symbol = name.charAt(j);
                if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'A' || symbol == 'I' || symbol == 'O' || symbol == 'U' || symbol == 'E') {
                    encryption += (int) symbol * name.length();
                } else {
                    encryption += (int) symbol / name.length();
                }
            }
            encryptedStrings[i] = encryption;
        }

        Arrays.sort(encryptedStrings);
        for (int encryptedString : encryptedStrings) {
            System.out.println(encryptedString);
        }
    }
}
