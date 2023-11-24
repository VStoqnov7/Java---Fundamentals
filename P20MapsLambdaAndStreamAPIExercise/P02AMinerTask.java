package P20MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
        //ресурс -> сума от количество
        String resource = scanner.nextLine(); //ресурс или "stop"
        while(!resource.equals("stop")) {
            //ресурс
            int quantity = Integer.parseInt(scanner.nextLine());
            //проверка имам ли такъв ресурс
            //ако нямам такъв ресурс
            if(!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            }
            //ако имам такъв ресурс
            else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, currentQuantity + quantity);
            }
            resource = scanner.nextLine();
        }

        //resourcesQuantity.forEach((key, value) -> System.out.println(key + " -> " + value));
        resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}


//        String command = scanner.nextLine();
//        LinkedHashMap<String, Integer> resourceQuantity = new LinkedHashMap<>();
//
//
//
//        while (!command.equals("stop")) {
//
//            String resource = command;
//            int quantity = Integer.parseInt(scanner.nextLine());
//
//            if (resourceQuantity.containsKey(resource)){
//                resourceQuantity.put(resource,resourceQuantity.get(resource) + quantity);
//            }else {
//            resourceQuantity.put(resource,quantity);
//
//            }
//
//
//            command = scanner.nextLine();
//        }
//
//        for (Map.Entry<String, Integer> entry : resourceQuantity.entrySet()) {
//
//            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
//
//
//
//        }
//
//
//    }
//}
