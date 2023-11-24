package P26RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        String[] name = scanner.nextLine().split("[, ]+");


        Pattern patternHealth = Pattern.compile("[^0-9+\\-*/.]");

        Pattern patternDamage = Pattern.compile("-?[0-9]*[.]?[0-9]+");

        Pattern patternSymbol = Pattern.compile("[/*]");



        for (int i = 0; i < name.length; i++) {


            Matcher matcherHealth = patternHealth.matcher(name[i]);

            int health = 0;

            while (matcherHealth.find()){

                String input = matcherHealth.group();

                char symbol = input.charAt(0);

                int sum = (int) symbol;
                //int myInt = Character.getNumericValue(myChar);

                health += sum;

            }


            Matcher matcherDamage = patternDamage.matcher(name[i]);

            double damage = 0;

            while (matcherDamage.find()){
                double input = Double.parseDouble(matcherDamage.group());
                damage += input;

            }

            Matcher matcherSymbol = patternSymbol.matcher(name[i]);


            while (matcherSymbol.find()){

                String symbol = matcherSymbol.group();

                if (symbol.equals("*")){
                    damage = damage * 2;
                } else if (symbol.equals("/")) {
                    damage = damage / 2;

                }


            }




            System.out.printf("%s - %d health, %.2f damage%n",name[i],health,damage);


        }











    }
}
