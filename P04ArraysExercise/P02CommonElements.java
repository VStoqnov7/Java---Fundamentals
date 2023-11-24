package P04ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String firstRow = scanner.nextLine();  //"Hey hello 2 4"
        String secondRow = scanner.nextLine(); //"10 hey 4 hello"

        String[] firstArray = firstRow.split(" ");    //["Hey", "hello", "2", "4"]
        String [] secondArray = secondRow.split(" "); //["10", "hey", "4", "hello"]

        //обхождам всички елементи на втория масив
        for (String secondElement : secondArray) {
            //какво повтарям за всеки елемент от втория масив: обхождам първия масив
            for (String firstElement : firstArray) {
                if (secondElement.equals(firstElement)) {
                    //общ елемент в двата масива
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }

        //for loop -> трябва да работим с индексите на масива и да достъпваме елементите по индекс
        //foreach loop -> достъпваме всички елементи без значение от техния индекс
    }
}



//        String[] firstArr = scanner.nextLine().split(" ");
//        String[] secondArr = scanner.nextLine().split(" ");
//
//
//        for (String second : secondArr) {
//            for (String first : firstArr) {
//                if (second.equals(first))
//                    System.out.print(first + " ");
//
//            }
//
//        }
//
//
//
//    }
//}
