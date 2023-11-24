package P23TextProcessingExercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1. входни данни
        String input = scanner.nextLine(); // "sh, too_long_username, !lleg@l ch@rs, jeffbutt"
        String[] usernames = input.split(", "); // ["sh", "too_long_username", "!lleg@l ch@rs", "jeffbutt"]

        //2. обходя usernames -> правя проверка дали е валиден -> принтирам
        for (String username : usernames) {
            //ако username e валиден
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }
    //метод, който проверява дали username е валиден
    //true -> ако username е валиден
    //false -> ако username не е валиден
    private static boolean isValidUsername (String username) {
        //1. валидна дължина
        // [3; 16] -> валидна
        if (username.length() < 3 || username.length() > 16) {
            //невалидна дължина -> невалиден username
            return false;
        }
        //дължина е [3; 16] => валидна дължина

        //2. валидно съдържание -> букви, цифри, -, _
        //username = "Test№ser".toCharArray() -> ['T', 'e', 's', ....]
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                //невалиден символ -> невалиден username
                return false;
            }
        }
        //валидно съдържание и валидна дължина
        return true;
    }


}

//        String line = scanner.nextLine();
//        String[] usernames = line.split(", ");
//
//        for (String username : usernames) {
//            if (isValid(username)) {
//                System.out.println(username);
//            }
//        }
//    }
//
//    public static boolean isValid(String username) {
//        if (username.length() < 3 || username.length() > 16) {
//            return false;
//        }
//        for (int i = 0; i < username.length(); i++) {
//            char ch = username.charAt(i);
//            if (!(Character.isLetterOrDigit(ch) || ch == '-' || ch == '_')) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
