package P29FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            Pattern pattern = Pattern.compile("(\\@#+)(?<name>[A-Z][A-Za-z0-9]{4,}[A-Z])(\\@#+)");
            Matcher matcher = pattern.matcher(command);


            if (matcher.find()) {

                String name = matcher.group("name");

                StringBuilder sb = new StringBuilder();


                int count = 0;

                for (char item : name.toCharArray()) {

                    if (Character.isDigit(item)) {
                        count++;


                        sb.append(item);


                    }


                }


                if (count == 0) {
                    System.out.println("Product group: 00");
                } else {

                    System.out.printf("Product group: %s%n", sb);


                }


            } else {
                System.out.println("Invalid barcode");
            }


        }


    }
}
