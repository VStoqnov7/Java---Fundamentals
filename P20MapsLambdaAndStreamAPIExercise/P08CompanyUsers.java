package P20MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> listOfEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] info = input.split(" -> ");

            List<String> currentCompanyEmployees = listOfEmployees.get(info[0]);
            boolean containsId = currentCompanyEmployees != null && currentCompanyEmployees.contains(info[1]);

            if (!containsId) {
                listOfEmployees.putIfAbsent(info[0], new ArrayList<>());
                listOfEmployees.get(info[0]).add(info[1]);
            }


            input = scanner.nextLine();
        }

        listOfEmployees.entrySet().stream()
                .forEach(c -> {
                    System.out.printf("%s%n", c.getKey());
                    c.getValue().forEach(e -> System.out.printf("-- %s%n", e));
                });


    }
}

//        String command = scanner.nextLine();
//
//        Map<String, ArrayList<String>> map = new LinkedHashMap<>();
//
//        while (!command.equals("End")){
//
//            String company = command.split(" -> ")[0];
//            String id = command.split(" -> ")[1];
//
//            map.putIfAbsent(company,new ArrayList<>());
//            if (map.get(company).contains(id)){
//                command = scanner.nextLine();
//                continue;
//
//            }
//            map.get(company).add(id);
//
//            command = scanner.nextLine();
//        }
//        System.out.println();
//
//
//        map.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey());
//            entry.getValue().forEach(player -> System.out.println("-- " + player));
//        });
//
//
////        map.forEach((key, value) -> {
////            System.out.println(key);
////            value.forEach(player -> System.out.println("-- " + player));
////        });
//
//
//
//    }
//}
