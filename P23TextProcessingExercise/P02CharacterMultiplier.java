package P23TextProcessingExercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String name1 = input[0];
        String name2 = input[1];


        int max = Math.max(name1.length(),name2.length());
        int min = Math.min(name1.length(),name2.length());


        int result = 0;


        for (int i = 0; i < min; i++) {

            int symbol1 = name1.charAt(i);
            int symbol2 = name2.charAt(i);


            result += symbol1 * symbol2;


        }


        if (name1.length() > min){
            for (int i = min; i < max; i++) {
                result += name1.charAt(i);

            }
        } else if (name2.length() > min) {
            for (int i = min; i < max; i++) {
                result += name2.charAt(i);

            }
        }

        System.out.println(result);



    }
}

//
//
//    String input = scanner.nextLine(); //"George Peter"
//    String [] names = input.split("\\s+"); //["George", "Peter"]
//
//    String firstText = names[0]; //"George" -> 6
//    String secondText = names[1]; //"Peter" -> 5
//
//    int minLength = Math.min(firstText.length(), secondText.length()); //дължина на по-късия текст -> 5
//    int maxLength = Math.max(firstText.length(), secondText.length()); //дължина на по-дългия текст -> 6
//
//    int sum = 0;
//        for (int index = 0; index < minLength; index++) {
//        sum += (firstText.charAt(index) * secondText.charAt(index));
//        }
//
//        //еднакви дължини на текстовете
//        if (maxLength == minLength) {
//        System.out.println(sum);
//        return;
//        }
//
//        sum = getLeftSymbols(firstText, secondText, minLength, maxLength, sum);
//
//        System.out.println(sum);
//
//        }
//
//private static int getLeftSymbols(String firstText, String secondText, int minLength, int maxLength, int sum) {
//        //кой е по-дългия текст -> останалите букви, които не са участвали в умножението
//        if (maxLength == firstText.length()) {
//        //първия текст ми е по-дълъг -> взимам останалите символи
//        for (int index = minLength; index < firstText.length(); index++) {
//        sum += firstText.charAt(index);
//        }
//        } else {
//        //втория текст ми е по-дълъг -> взимам останали символи
//        for (int index = minLength; index < secondText.length(); index++) {
//        sum += secondText.charAt(index);
//        }
//        }
//        return sum;
//        }
//        }
