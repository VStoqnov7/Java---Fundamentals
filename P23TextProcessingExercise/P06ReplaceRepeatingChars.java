package P23TextProcessingExercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder builder = new StringBuilder(inputText);

        for (int index = 0; index < builder.length() - 1 ; index++) {
            if(builder.charAt(index) == builder.charAt(index + 1)) {
                builder.deleteCharAt(index + 1);
                index--;
            }
        }

        System.out.println(builder);

    }
}


//
//        String command = scanner.nextLine();
//
//        String name = "";
//
//
//        for (int i = 0; i < command.length(); i++) {
//            char symbol = command.charAt(i);
//
//            if (!name.endsWith(String.valueOf(command.charAt(i)))){
//                name += command.charAt(i);
//            }
//
//        }
//
//
//        System.out.println(name);
//
//    }
//}
