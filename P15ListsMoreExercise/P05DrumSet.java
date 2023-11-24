package P15ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double money = Double.parseDouble(scanner.nextLine());

        List<Integer> drums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> saveDrum = new ArrayList<>();

        for (int i = 0; i < drums.size(); i++) {
            saveDrum.add(i, drums.get(i));

        }


        String command = scanner.nextLine();


        while (!command.equals("Hit it again, Gabsy!")) {

            int hit = Integer.parseInt(command);

            for (int i = 0; i < drums.size(); i++) {
                drums.set(i, drums.get(i) - hit);

                if (drums.get(i) <= 0) {

                    if (money - (saveDrum.get(i) * 3) >= 0){
                    money -= saveDrum.get(i) * 3;
                    drums.set(i, saveDrum.get(i));

                    }else {
                        int indexDrum = drums.indexOf(drums.get(i));
                        drums.remove(indexDrum);
                        saveDrum.remove(indexDrum);
                        i--;


                    }

                }
            }


            command = scanner.nextLine();
        }


        for (Integer drum : drums) {
            System.out.print(drum + " ");


        }

        System.out.println();


        System.out.printf("Gabsy has %.2flv. ", money);


    }
}
