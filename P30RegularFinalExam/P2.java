package P30RegularFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            Pattern pattern = Pattern.compile("!(?<first>[A-Z][a-z]+)!\\:\\[(?<name>[A-Za-z]+)\\]");
            Matcher matcher = pattern.matcher(command);

            if (matcher.find()){
                String first = matcher.group("first");
                String name = matcher.group("name");

                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < name.length(); j++) {
                    sb.append((int)name.charAt(j) + " ");
                }
                System.out.printf("%s: %s%n",first,sb);

            }else {
                System.out.println("The message is invalid");
            }

        }

    }
}
