package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int ball = 0;
        int ballTime = 0;
        int ballQuality = 0;
        double value = 0;

        for (int i = 1; i <= number ; i++) {

            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double result = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);

            if (result >= value){
                value = result;
                ball = snowBallSnow;
                ballTime = snowBallTime;
                ballQuality = snowBallQuality;

            }



        }


        System.out.printf("%d : %d = %.0f (%d)",ball,ballTime,value,ballQuality);







    }
}
