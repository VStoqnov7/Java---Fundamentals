package P21MapsLambdaAndStreamAPIMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();


        Map<String, Map<String, Integer>> products = new LinkedHashMap<>();


        while (!command.equals("no more time")) {


            String name = command.split(" -> ")[0];
            String curse = command.split(" -> ")[1];
            int point = Integer.parseInt(command.split(" -> ")[2]);


            if (!products.containsKey(curse)) {

                products.put(curse, new LinkedHashMap<>());
                products.get(curse).put(name, point);
            } else if (products.containsKey(curse) && products.get(curse).containsKey(name)) {

                int savePoint = products.get(curse).get(name);

                if (savePoint < point) {
                    products.get(curse).put(name, point);
                }


            } else {
                products.get(curse).put(name, point);
            }


            command = scanner.nextLine();
        }


        products.forEach((k, v) -> {
            int[] num = {1};
            System.out.printf("%s: %d participants%n", k, v.size());
            v.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(e -> System.out.printf("%d. %s <::> %d%n", num[0]++, e.getKey(), e.getValue()));
        });

        System.out.println("Individual standings:");

        Map<String, Integer> results = new LinkedHashMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : products.entrySet()) {
            for (Map.Entry<String, Integer> mapEntry : entry.getValue().entrySet()) {
                results.putIfAbsent(mapEntry.getKey(), 0);
                results.put(mapEntry.getKey(), results.get(mapEntry.getKey()) + mapEntry.getValue());
            }
        }

        int[] num = {1};
        results.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%d. %s -> %d%n", num[0]++, e.getKey(), e.getValue()));


    }
}
