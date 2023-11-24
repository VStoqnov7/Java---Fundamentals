package P20MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,String> registeredStudents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){

            String[] data = scanner.nextLine().split("\\s+");

            String command = data[0];

            switch (command) {
                case "register":

                    String studentName = data[1];
                    String plateNumber = data[2];

                    if(registeredStudents.containsKey(studentName)) {
                        System.out.println(String.format("ERROR: already registered with plate number %s",
                                plateNumber));
                    } else {
                        registeredStudents.put(studentName, plateNumber);
                        System.out.println(String.format("%s registered %s successfully", studentName, plateNumber));
                    }

                    break;
                case "unregister":

                    String userName = data[1];

                    if(!registeredStudents.containsKey(userName)) {
                        System.out.println(String.format("ERROR: user %s not found", userName));
                    } else {
                        registeredStudents.remove(userName);
                        System.out.println(String.format("%s unregistered successfully", userName));
                    }

                    break;
            }
        }

        registeredStudents.forEach((key, value) ->
                System.out.println(String.format("%s => %s", key, value)));


    }
}


//        int n = Integer.parseInt(scanner.nextLine());
//
//        LinkedHashMap<String,String> product = new LinkedHashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] command = scanner.nextLine().split(" ");
//
//            String input = command[0];
//
//            switch (input){
//                case "register":
//                    String nameReg = command[1];
//                    String numberReg = command[2];
//
//                    if (product.containsKey(nameReg)){
//                        System.out.printf("ERROR: already registered with plate number %s%n",numberReg);
//
//                    }else {
//                        product.put(nameReg,numberReg);
//                        System.out.printf("%s registered %s successfully%n",nameReg,numberReg);
//                    }
//
//                    break;
//                case "unregister":
//                    String nameUnReg = command[1];
//
//                    if (product.containsKey(nameUnReg)){
//                        System.out.printf("%s unregistered successfully%n",nameUnReg);
//                        product.remove(nameUnReg);
//                    }else {
//                        System.out.printf("ERROR: user %s not found%n",nameUnReg);
//
//                    }
//                    break;
//            }
//
//        }
//
//        for (Map.Entry<String, String> entry : product.entrySet()) {
//            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
//
//        }
//
//    }
//}
