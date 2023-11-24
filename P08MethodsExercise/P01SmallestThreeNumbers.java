package P08MethodsExercise;

import java.util.Scanner;

public class P01SmallestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        smallNumber(number1,number2,number3);




    }
    public static void smallNumber(int num1, int num2, int num3){

        int smallNumber = Math.min(Math.min(num1, num2), num3);

        System.out.print(smallNumber);



    }
}

//    Scanner scanner = new Scanner(System.in);
//    int number1 = Integer.parseInt(scanner.nextLine());
//    int number2 = Integer.parseInt(scanner.nextLine());
//    int number3 = Integer.parseInt(scanner.nextLine());
//
//    //метод, който да принтира най-малкото измежду 3 числа
//    printSmallestNumber(number1, number2, number3);
//}
//
//public static void printSmallestNumber (int n1, int n2, int n3) {
//        //първото число да е най-малко
//        if (n1 < n2 && n1 < n3) {
//        System.out.println(n1);
//        }
//        //второто число да е най-малко
//        else if (n2 < n1 && n2 < n3) {
//        System.out.println(n2);
//        }
//        //третото число да е най-малко
//        else {
//        System.out.println(n3);
//        }
//        }
//        }
