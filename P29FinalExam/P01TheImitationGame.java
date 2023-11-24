package P29FinalExam;


import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the encrypted message
        String message = scanner.nextLine();

        // Process the commands
        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] tokens = command.split("\\|");
            String operation = tokens[0];
            switch (operation) {
                case "Move":
                    int numLetters = Integer.parseInt(tokens[1]);
                    message = message.substring(numLetters) + message.substring(0, numLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    message = message.substring(0, index) + value + message.substring(index);
                    break;
                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    message = message.replace(substring, replacement);
                    break;
            }
            command = scanner.nextLine();
        }

        // Print the decrypted message
        System.out.println("The decrypted message is: " + message);
    }
}

//
//        Whit StringBuilder !!!
//
//
//                StringBuilder message = new StringBuilder(scanner.nextLine());
//
//        // Process the commands
//        String command = scanner.nextLine();
//        while (!command.equals("Decode")) {
//            String[] tokens = command.split("\\|");
//            String operation = tokens[0];
//            switch (operation) {
//                case "Move":
//                    int numLetters = Integer.parseInt(tokens[1]);
//                    message.append(message.substring(0, numLetters)).delete(0, numLetters);
//                    break;
//                case "Insert":
//                    int index = Integer.parseInt(tokens[1]);
//                    String value = tokens[2];
//                    message.insert(index, value);
//                    break;
//                case "ChangeAll":
//                    String substring = tokens[1];
//                    String replacement = tokens[2];
//                    int startIndex = 0;
//                    while ((startIndex = message.indexOf(substring, startIndex)) != -1) {
//                        message.replace(startIndex, startIndex + substring.length(), replacement);
//                        startIndex += replacement.length();
//                    }
//                    break;
//            }
//            command = scanner.nextLine();
//        }
//
//        // Print the decrypted message
//        System.out.println("The decrypted message is: " + message);
//    }
//}

