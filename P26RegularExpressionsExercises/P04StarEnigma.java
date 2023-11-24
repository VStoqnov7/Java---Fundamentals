package P26RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int attacked = 0;
        int destroyed = 0;

        List<String> listAttackedPlanet = new ArrayList<>();
        List<String> listDestroyedPlanet = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();
            int numBack = 0;

            for (char letter : command.toCharArray()) {
                if (letter == 'S' || letter == 's' || letter == 'T'|| letter == 't'|| letter == 'A'|| letter == 'a' || letter == 'R' || letter == 'r'){
                    numBack++;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < command.length(); j++) {

                char letter = (char) (command.charAt(j) - numBack);

                sb.append(letter);


            }

            String realName = sb.toString();

            Pattern patternName = Pattern.compile("@(?<namePlanet>[A-Za-z]+)([^@\\-!:>])*:(?<population>[0-9]+)([^@\\-!:>])*!(?<attackOrDestroyed>[AD])!([^@\\-!:>])*->(?<soldier>[0-9]+)");



            Matcher matcherName = patternName.matcher(realName);


            if (matcherName.find()){
                String name = matcherName.group("namePlanet");
                int population = Integer.parseInt(matcherName.group("population"));
                String attackOrDestroyed = matcherName.group("attackOrDestroyed");
                int soldier = Integer.parseInt(matcherName.group("soldier"));

                if (attackOrDestroyed.equals("A")){
                    attacked++;
                    listAttackedPlanet.add(name);


                } else if (attackOrDestroyed.equals("D")) {
                    destroyed++;
                    listDestroyedPlanet.add(name);

                }


            }


        }


        Collections.sort(listAttackedPlanet);
        Collections.sort(listDestroyedPlanet);

        System.out.printf("Attacked planets: %d%n",attacked);
        listAttackedPlanet.forEach(name -> System.out.println("-> " + name));
        System.out.printf("Destroyed planets: %d%n",destroyed);
        listDestroyedPlanet.forEach(name -> System.out.println("-> " + name));


    }
}
