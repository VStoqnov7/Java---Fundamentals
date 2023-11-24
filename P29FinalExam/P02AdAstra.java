package P29FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<name>[A-Za-z ]+)\\1(?<data>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");
        Matcher matcher = pattern.matcher(command);

        List<String> listProducts = new ArrayList<>();


        int sumCalories = 0;


        while (matcher.find()) {


            String name = matcher.group("name");
            String data = matcher.group("data");
            String calories = matcher.group("calories");


            int numCalories = Integer.parseInt(calories);

            sumCalories += numCalories;

            listProducts.add(String.format("Item: %s, Best before: %s, Nutrition: %s",name, data, calories));



        }


        int dayLife = sumCalories / 2000;


        if (dayLife >= 0) {
            System.out.printf("You have food to last you for: %d days!%n", dayLife);
            if (!listProducts.isEmpty()) {
                listProducts.forEach(System.out::println);

            }

        }


    }
}
