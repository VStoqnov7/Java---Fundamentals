package P29FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Map<String,Integer>> products = new LinkedHashMap<>();

        while (!command.equals("Sail")){

            String[] input = command.split("\\|\\|");

            String town = input[0];
            int people = Integer.parseInt(input[1]);
            int gold = Integer.parseInt(input[2]);

            if (!products.containsKey(town)){
                products.put(town, new LinkedHashMap<>());
                products.get(town).put("people", people);
                products.get(town).put("gold",gold);


            }else {
                int peopleSave = products.get(town).get("people");
                int goldSave = products.get(town).get("gold");

                products.get(town).put("people",peopleSave + people);
                products.get(town).put("gold",goldSave + gold);

            }



            command = scanner.nextLine();
        }

        String newCommand = scanner.nextLine();

        while (!newCommand.equals("End")){

            String[] input = newCommand.split("=>");

            switch (input[0]){
                case "Plunder":
                    String townPlunder = input[1];
                    int peoplePlunder = Integer.parseInt(input[2]);
                    int goldPlunder = Integer.parseInt(input[3]);

                    if (products.containsKey(townPlunder)){
                        int newPeople = products.get(townPlunder).get("people") - peoplePlunder;
                        int newGold = products.get(townPlunder).get("gold") - goldPlunder;

                        products.get(townPlunder).put("people",newPeople);
                        products.get(townPlunder).put("gold",newGold);


                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",townPlunder,goldPlunder,peoplePlunder);

                        if (products.get(townPlunder).get("people") <= 0 || products.get(townPlunder).get("gold") <= 0){
                            products.remove(townPlunder);
                            System.out.printf("%s has been wiped off the map!%n",townPlunder);

                        }

                    }

                    break;
                case "Prosper":
                    //Prosper=>{town}=>{gold}
                    String townProsper = input[1];
                    int goldProsper = Integer.parseInt(input[2]);
                    if (goldProsper > 0 && products.containsKey(townProsper)){
                        int saveGold = products.get(townProsper).get("gold");
                        products.get(townProsper).put("gold",saveGold + goldProsper);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldProsper,townProsper,products.get(townProsper).get("gold"));

                    }
                    if (goldProsper < 0){
                        System.out.println("Gold added cannot be a negative number!");

                    }

                    break;


            }
            newCommand = scanner.nextLine();
        }


        if (!products.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",products.size());


            products.entrySet().forEach(entry -> {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",entry.getKey(),products.get(entry.getKey()).get("people"),products.get(entry.getKey()).get("gold"));
            });


        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        }

    }
}
