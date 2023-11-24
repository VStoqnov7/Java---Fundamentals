package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        int lastPosition = 0;
        int removeValentine = 2;


        while (!command.equals("Love!")) {

            int jump = Integer.parseInt(command.split(" ")[1]);

            int lastAndBeforePosition = lastPosition + jump;

            if (lastAndBeforePosition >= 0 && lastAndBeforePosition < list.size()) {
                list.set(lastAndBeforePosition, list.get(lastAndBeforePosition) - removeValentine);


            } else {
                lastAndBeforePosition = 0;

                list.set(lastAndBeforePosition, list.get(lastAndBeforePosition) - removeValentine);


            }

            if (list.get(lastAndBeforePosition) == 0) {
                System.out.printf("Place %d has Valentine's day.%n", lastAndBeforePosition);
            } else if (list.get(lastAndBeforePosition) < 0) {
                System.out.printf("Place %d already had Valentine's day.%n",lastAndBeforePosition);


            }
            lastPosition = lastAndBeforePosition;

            command = scanner.nextLine();
        }


        System.out.printf("Cupid's last position was %d.%n", lastPosition);


        int number = 0;
        int numberHappy = 0;
        for (Integer item : list) {
            if (item > 0) {
                number++;
            }else {
                numberHappy++;
            }

        }


        if (number > 0){
        System.out.printf("Cupid has failed %d places.%n", number);

        }else {
            System.out.printf("Mission was successful.");

        }


    }
}
