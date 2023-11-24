package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int n = Integer.parseInt(scanner.nextLine()); //брой на кегове с бира

        double maxVolume = Double.MIN_VALUE; //максималния обем = 0
        String maxModel = ""; // модел на кега с най-голям обем
        for (int keg = 1; keg <= n; keg++) {
            //въвеждаме информация
            String model = scanner.nextLine(); //модел / вид на кега
            double radius = Double.parseDouble(scanner.nextLine()); //радиус
            int height = Integer.parseInt(scanner.nextLine()); //височина
            //намираме обем = π * r^2 * h
            double volume = Math.PI * Math.pow(radius, 2) * height;
            //проверка дали обема е максимален
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}

//
//        int number = Integer.parseInt(scanner.nextLine());
//
//        String beerName = "";
//        double maxKeg = 0;
//
//
//        for (int i = 1; i <= number ; i++) {
//
//            String name = scanner.nextLine();
//            double radius = Double.parseDouble(scanner.nextLine());
//            int height = Integer.parseInt(scanner.nextLine());
//
//            double calculated = 3.14 * radius * radius * height;
//
//            if (maxKeg < calculated){
//                beerName = name;
//                maxKeg = calculated;
//            }
//
//
//
//        }
//
//
//        System.out.println(beerName);
//
//    }
//}
