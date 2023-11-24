package P20MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>(); //product -> quantity
        Map<String, Double> productsPrice = new LinkedHashMap<>(); //product -> price

        //Map<String, List<Double>>: продукт -> {количество, цена}

        while (!data.equals("buy")) {
            //data = "{name} {price} {quantity}".split(" ") -> ["{name}", "{price}", "{quantity}"]
            String product = data.split("\\s+")[0]; //име на продукта
            double price = Double.parseDouble(data.split("\\s+")[1]); //цена на продукта
            int quantity = Integer.parseInt(data.split("\\s+")[2]); //количество на продукта

            //за количество -> не сме срещали такъв продукт
            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                int currentQuantity = productsQuantity.get(product);
                productsQuantity.put(product, currentQuantity + quantity);
            }

            //за цена -> всеки път да добавяме срещу продукта въведената
            productsPrice.put(product, price);

            data = scanner.nextLine();
        }

        //продукт -> количество
        //продукт -> ед. цена


        //продукт -> колко е платено за него (количество * ед. цена)
        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            //entry
            //key (име на продукта)
            //value (брой)
            String productName = entry.getKey();
            double finalSum = productsQuantity.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}


//        String command = scanner.nextLine();
//        LinkedHashMap<String, ArrayList<Double>> products = new LinkedHashMap<>();
//
//        while (!command.equals("buy")){
//
//            String[] name = command.split(" ");
//
//            String product = name[0];
//            double sum = Double.parseDouble(name[1]);
//            double quantity = Double.parseDouble(name[2]);
//
//
//            if (products.containsKey(product)){
//                products.get(product).set(0,sum);
//                double save = products.get(product).get(1) + quantity;
//                products.get(product).set(1,save);
//            }else {
//                products.put(product, new ArrayList<>());
//                products.get(product).add(sum);
//                products.get(product).add(quantity);
//            }
//
//            command = scanner.nextLine();
//        }
//
//
//        for (Map.Entry<String, ArrayList<Double>> entry : products.entrySet()) {
//
//            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue().get(0) * entry.getValue().get(1));
//
//        }
//
//
//    }
//}
