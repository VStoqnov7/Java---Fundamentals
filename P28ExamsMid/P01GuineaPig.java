package P28ExamsMid;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double guinea = Double.parseDouble(scanner.nextLine()) * 1000;
        int days = 1;



        while (food > 0 && hay > 0 && cover > 0 && days <= 30){

            food = food - 300;
            if (days % 2 == 0){
                hay = hay - (food * 0.05);
            }

            if (days % 3 == 0){
                cover = cover - (guinea / 3);
            }

            days++;
        }

        DecimalFormat df = new DecimalFormat("0.##");


        if (food > 0 && hay > 0 && cover > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",food / 1000,hay / 1000, cover / 1000);

        }else {
            System.out.println("Merry must go to the pet store!");

        }













    }
}
