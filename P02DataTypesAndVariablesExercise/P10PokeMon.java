package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int power = Integer.parseInt(scanner.nextLine()); //текуща сила
        int distance = Integer.parseInt(scanner.nextLine()); //разстояние между цели за удряне
        int factor = Integer.parseInt(scanner.nextLine()); //фактор на изтощение

        int startPower = power;  //първоначална сила
        //повтаряме:
        //1. power - distance -> стигаме до целта си
        //2. удряме цел
        //stop: power < distance
        //продължавам: power >= distance

        int countTarget = 0; //брой ударени цели
        while (power >= distance) {
            //1. отивам до целта -> намаляме силата с изминатото разстояние
            power -= distance; //power = power - distance;
            //2. удряме цел
            countTarget++;

            //проверка за умора
            if (power == startPower / 2) {
                //сила / фактор
                if (factor != 0) {
                    //позволена аритметична операция (деление)
                    power = power / factor; // power /= factor;
                }
            }
        }

        System.out.println(power);
        System.out.println(countTarget);


    }
}

//
//        int pokemonPower = Integer.parseInt(scanner.nextLine());
//        int distance = Integer.parseInt(scanner.nextLine());
//        int exhaustionFactory = Integer.parseInt(scanner.nextLine());
//
//        int targetsPoked = 0;
//
//        double originalValue = pokemonPower * 0.50;
//
//        while (pokemonPower >= distance)
//        {
//            if (pokemonPower == originalValue) {
//                if (exhaustionFactory > 0){
//                pokemonPower = pokemonPower / exhaustionFactory;
//                if (pokemonPower < distance) {
//                    break;
//                }
//
//                }
//            }
//            pokemonPower -= distance;
//            targetsPoked++;
//        }
//
//        System.out.println(pokemonPower);
//        System.out.println(targetsPoked);
//
//
//    }
//}
