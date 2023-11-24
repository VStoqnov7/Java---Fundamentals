package P09MethodsMoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        String input2 = scanner.nextLine();


        printName(command,input2);



    }
    public static void printName (String command,String input2) {

        switch (command){
            case "int":
                int number = Integer.parseInt(input2) * 2;
                System.out.println(number);
                break;
            case "real":
                double num = Double.parseDouble(input2) * 1.5;
                System.out.printf("%.2f",num);
                break;
            case "string":
                System.out.println("$" + input2 + "$");
                break;

        }


    }
}
