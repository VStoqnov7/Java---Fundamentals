package P15ListsMoreExercise;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> middle = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());




        int index = middle.size()/2;


        DecimalFormat df = new DecimalFormat("########.0");

        double sumLeft = 0.0;

        for (int i = 0; i < index; i++) {
            if (middle.get(i) == 0){
                sumLeft *= 0.80;
            }else {
                sumLeft += middle.get(i);
            }
        }

        double sumRight = 0.0;

        for (int i = middle.size() - 1; i > index ; i--) {
            if (middle.get(i) == 0){
                sumRight *= 0.80;
            }else {
                sumRight += middle.get(i);
            }

        }

        double min = Math.min(sumRight,sumLeft);

        if (sumRight > sumLeft){
            System.out.print("The winner is left with total time: " + df.format(min));
        }else {
            System.out.print("The winner is right with total time: " + df.format(min));
        }



    }
}
