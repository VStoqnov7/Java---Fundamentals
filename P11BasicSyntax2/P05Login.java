package P11BasicSyntax2;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> username
        String username = scanner.nextLine();
        //2. password -> username наобратно
        String password = ""; //парола

        //username: "Acer" -> password: "recA"
        //първия символ -> 0 позиция
        //последния символ -> дължина - 1 позиция

        //последната позиция -> първата
        for (int position = username.length() - 1; position >= 0; position--) {
            //1. взимаме символът на съответната позиция
            char currentSymbol = username.charAt(position);
            //2. добавяме към паролата
            password += currentSymbol;
        }

        //повтарящо действие: въвеждаме някаква парола
        //стоп: въведената парола == password
        //продължаваме: въведената парола != password

        String enteredPassword = scanner.nextLine(); //ВЪВЕДЕНАТА ПАРОЛА
        int countFailedTries = 0; //брой неуспешни опита
        while (!enteredPassword.equals(password)) {
            //грешно въведена парола
            countFailedTries++;
            //1. проверяваме за блокиране
            if (countFailedTries == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            //2. опитай отново
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //вярна парола
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}

//        String username = scanner.nextLine();
//
//
//        String password = "";
//
//
//        for (int position = username.length()-1; position >= 0 ; position--) {
//
//            char currentSymbol = username.charAt(position);
//
//            password += currentSymbol;
//
//
//        }
//
//
//        String enteredPassword = scanner.nextLine();
//
//        int countFailedTries = 0;
//
//        while (!enteredPassword.equals(password)){
//            countFailedTries++;
//            if (countFailedTries == 4){
//                System.out.printf("User %s blocked!",username);
//                break;
//            }
//
//
//            System.out.println("Incorrect password. Try again.");
//
//            enteredPassword = scanner.nextLine();
//
//
//
//        }
//
//        if (enteredPassword.equals(password)){
//
//            System.out.printf("User %s logged in.", username);
//        }
//
//
//
//
//
//    }
//}
