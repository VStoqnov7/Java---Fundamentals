package P29FinalExam;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String,Double>> products = new LinkedHashMap<>();;

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("<->");
            String name = input[0];
            double rarity = Double.parseDouble(input[1]);

            if (!products.containsKey(name)){
                products.put(name,new LinkedHashMap<>());
                products.get(name).put("rarity",rarity);
                products.get(name).put("rating",0.00);
                products.get(name).put("numRating",0.00);

            }else {
                double saveRarity = products.get(name).get("rarity");
                products.get(name).put("rarity",saveRarity + rarity);
            }


        }


        String command = scanner.nextLine();

        while (!command.equals("Exhibition")){

            String[] input = command.split(" ");


            switch (input[0]){
                case "Rate:":
                    //Rate: {plant} - {rating}
                    String nameRate = input[1];
                    double ratingRate = Double.parseDouble(input[3]);

                    if (products.containsKey(nameRate)){
                        double saveRating = products.get(nameRate).get("rating");
                        double saveNumRating = products.get(nameRate).get("numRating");
                        products.get(nameRate).put("rating",saveRating + ratingRate);
                        products.get(nameRate).put("numRating",saveNumRating + 1.00);

                    }else {
                        System.out.println("error");
                    }

                    break;
                case "Update:":
                    //Update: {plant} - {new_rarity}
                    String nameUpdate = input[1];
                    double rarityUpdate = Double.parseDouble(input[3]);

                    if (products.containsKey(nameUpdate)){
                        products.get(nameUpdate).put("rarity",rarityUpdate);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Reset:":
                    //Reset: {plant}
                    String nameReset = input[1];

                    if (products.containsKey(nameReset)){
                        products.get(nameReset).put("rating",0.00);
                        products.get(nameReset).put("numRating",0.00);
                    }else {
                        System.out.println("error");

                    }

                    break;
            }

            command = scanner.nextLine();
        }



        System.out.println("Plants for the exhibition:");

        products.entrySet().forEach(entry -> {
            DecimalFormat df = new DecimalFormat("0.00");
            if (Double.isNaN(entry.getValue().get("rating")/entry.getValue().get("numRating"))){
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",entry.getKey(),entry.getValue().get("rarity"),0.00);

            }else {
                System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",entry.getKey(),entry.getValue().get("rarity"),entry.getValue().get("rating")/entry.getValue().get("numRating"));

            }

        });











    }
}
