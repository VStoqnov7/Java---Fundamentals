package P01DataTypesAndVariablesLab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char symbol = scanner.nextLine().charAt(0);
        char symbolSecond = scanner.nextLine().charAt(0);
        char symbolThird = scanner.nextLine().charAt(0);



        System.out.printf("%c%c%c",symbol,symbolSecond,symbolThird);




    }
}
