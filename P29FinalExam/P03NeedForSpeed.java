package P29FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String,Integer>> products = new LinkedHashMap<>();


        int maxFuel = 75;


        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\|");
            String nameCar = input[0];
            int distance = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            if (!products.containsKey(nameCar)){
                products.put(nameCar,new LinkedHashMap<>());
                products.get(nameCar).put("distance",distance);
                products.get(nameCar).put("fuel",fuel);
            }
        }


        String command = scanner.nextLine();

        while (!command.equals("Stop")){


            String[] input = command.split(" : ");

            switch (input[0]){
                case "Drive":
                    //Шофиране: {кола}: {разстояние}: {гориво}
                    String nameCarDrive = input[1];
                    int distanceDrive = Integer.parseInt(input[2]);
                    int fuelDrive = Integer.parseInt(input[3]);

                    if (products.get(nameCarDrive).get("fuel") >= fuelDrive){
                        int saveDistance = products.get(nameCarDrive).get("distance");
                        int saveFuel = products.get(nameCarDrive).get("fuel");

                        products.get(nameCarDrive).put("distance",saveDistance + distanceDrive);
                        products.get(nameCarDrive).put("fuel", saveFuel - fuelDrive);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",nameCarDrive,distanceDrive,fuelDrive);

                    }else {
                        System.out.println("Not enough fuel to make that ride");

                    }

                    if (products.get(nameCarDrive).get("distance") >= 100000){
                        products.remove(nameCarDrive);
                        System.out.printf("Time to sell the %s!%n",nameCarDrive);

                    }
                    break;
                case "Refuel":
                    //Зареждане с гориво: {кола}: {гориво}
                    String nameRefuel = input[1];
                    int fuelRefuel = Integer.parseInt(input[2]);

                    if (products.containsKey(nameRefuel)){
                        int saveFuel = products.get(nameRefuel).get("fuel");
                        int fuelMin = Math.min(maxFuel,saveFuel + fuelRefuel);

                        products.get(nameRefuel).put("fuel",fuelMin);

                        System.out.printf("%s refueled with %d liters%n",nameRefuel,fuelMin - saveFuel);

                    }

                    break;
                case "Revert":
                    //Връщане: {кола}: {километри}

                    String nameRevert = input[1];
                    int distanceRevert = Integer.parseInt(input[2]);

                    if (products.containsKey(nameRevert)){
                        int saveDistance = products.get(nameRevert).get("distance");
                        products.get(nameRevert).put("distance",saveDistance - distanceRevert);

                        if (products.get(nameRevert).get("distance") <= 10000){
                            products.get(nameRevert).put("distance",10000);
                            break;
                        }
                        System.out.printf("%s mileage decreased by %d kilometers%n",nameRevert,distanceRevert);
                    }
                    break;
            }
            command = scanner.nextLine();
        }



        products.forEach((key, value) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", key, products.get(key).get("distance"), products.get(key).get("fuel")));



    }
}
