package P27RegularExpressionsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        List<String> nameList = new ArrayList<>();

        while (!command.equals("end")){

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < command.length(); i++) {

                int num = command.charAt(i) - n ;

                char symbol = (char) num;
                sb.append(symbol);

            }

            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*\\!(?<symbol>[A-Z])!");
            Matcher matcher = pattern.matcher(sb.toString());



            while (matcher.find()){
                String name = matcher.group("name");
                String symbol = matcher.group("symbol");


                if (symbol.equals("G")){
                    nameList.add(name);
                }

            }

            command = scanner.nextLine();
        }

        nameList.forEach(System.out::println);


    }
}
