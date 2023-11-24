package P29FinalExam;


import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();


        String input = scanner.nextLine();


        while (!input.equals("Generate")) {

            String[] name = input.split(">>>");

            switch (name[0]) {
                case "Contains":
                    String nameContains = name[1];
                    if (command.contains(nameContains)) {
                        System.out.printf("%s contains %s%n", command, nameContains);

                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String nameUpperOrLower = name[1];
                    int indexStart = Integer.parseInt(name[2]);
                    int indexEnd = Integer.parseInt(name[3]);

                    if (nameUpperOrLower.equals("Upper")) {
                        if (indexStart >= 0 && indexStart <= command.length() && indexEnd < command.length()) {
                            command = command.substring(0, indexStart) + command.substring(indexStart, indexEnd).toUpperCase() + command.substring(indexEnd);
                        }
                    } else if (nameUpperOrLower.equals("Lower")) {
                        command = command.substring(0, indexStart) + command.substring(indexStart, indexEnd).toLowerCase() + command.substring(indexEnd);

                    }
                    System.out.println(command);


                    break;
                case "Slice":
                    indexStart = Integer.parseInt(name[1]);
                    indexEnd = Integer.parseInt(name[2]);

                    if (indexStart >= 0 && indexStart <= command.length() && indexEnd < command.length()) {

                        command = command.substring(0,indexStart) + command.substring(indexEnd);

                    }

                    System.out.println(command);


                    break;


            }


            input = scanner.nextLine();
        }


        System.out.printf("Your activation key is: %s",command);


    }
}
