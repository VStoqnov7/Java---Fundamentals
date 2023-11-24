package P24TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();


        while (!command.equals("find")) {


            StringBuilder sb = new StringBuilder();


            for (int i = 0; i < command.length();) {

                for (int j = 0; j < num.size(); j++) {

                    if (i >= 0 && i < command.length()){

                    String letter = command.charAt(i) + "";
                    int letters = num.get(j);
                    int number = command.charAt(i) - num.get(j);
                    char symbol = (char) number;
                    sb.append(symbol);
                    i++;
                    }
                }
            }
            int indexStart = sb.indexOf("&");
            int indexEnd = sb.lastIndexOf("&");

            String name = sb.substring(indexStart + 1,indexEnd);

            int indexNameStart = sb.indexOf("<");
            int indexNameEnd = sb.indexOf(">");

            String name2 = sb.substring(indexNameStart + 1,indexNameEnd);

            System.out.printf("Found %s at %s%n",name,name2);


            command = scanner.nextLine();
        }


    }
}
