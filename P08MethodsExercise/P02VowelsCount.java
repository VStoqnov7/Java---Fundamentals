package P08MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        //метод, който принтира брой на гласните букви в текст
        printVowelsCount(text);

    }

    public static void printVowelsCount (String text) {
        //гласни букви: a, e, i, o, u, A, E, I, O, U
        //text = "Desislava"
        //.toLowerCase() -> "desislava"
        // .toCharArray() -> ['d', 'e', 's', 'i', ...]

        //"DeSiSlava".toLowerCase() -> "desislava"
        //"desilava".toUpperCase() -> "DESISLAVA"

        int count = 0; //брой на гласните букви
        for (char symbol :  text.toLowerCase().toCharArray()) {
            //проверка дали е гласна буква
            if (symbol == 'a'|| symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }

        System.out.println(count);

    }
}

//        String name = scanner.nextLine();
//
//        vowels(name);
//
//
//    }
//    public static void vowels(String name){
//
//        int numberVowels = 0;
//
//        for (int i = 0; i < name.length(); i++) {
//
//            char symbol = name.charAt(i);
//
//            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'A' || symbol == 'I' || symbol == 'O' || symbol == 'U' || symbol == 'E') {
//                numberVowels++;
//            }
//        }
//        System.out.print(numberVowels);
//
//
//    }
//}
