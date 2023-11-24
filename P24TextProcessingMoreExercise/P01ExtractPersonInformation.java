package P24TextProcessingMoreExercise;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();


            int indexNameStart = command.indexOf("@");
            int indexNameEnd = command.indexOf("|");

            int indexAgeStart = command.indexOf("#");
            int indexAgeEnd = command.indexOf("*");


            String name = command.substring(indexNameStart + 1,indexNameEnd);
            String age = command.substring(indexAgeStart + 1,indexAgeEnd);


            System.out.printf("%s is %s years old.%n",name,age);

        }

    }
}
