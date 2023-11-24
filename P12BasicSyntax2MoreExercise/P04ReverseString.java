package P12BasicSyntax2MoreExercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String nameOut = "";


        for (int i = name.length() - 1; i >= 0 ; i--) {

            char text = name.charAt(i);

            nameOut += text;


        }


        System.out.printf("%s",nameOut);







    }
}
