package P29FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<name1>[A-Za-z]{3,})\\1\\1(?<name2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(command);
        List<String> list = new ArrayList<>();

        int count = 0;

        while (matcher.find()){
            count++;
            String name1 = matcher.group("name1");
            String name2 = matcher.group("name2");

            String name1Reverse = reverse(name1);
            String name2Reverse = reverse(name2);

///           String wordReverser1 = new StringBuilder(name1).reverse().toString();
///           String wordReverser2 = new StringBuilder(name2).reverse().toString();

            if (name1.equals(name2Reverse)){

                list.add(name1 + " <=> " + name2);


            } else if (name2.equals(name1Reverse)) {

                list.add(name1 + " <=> " + name2);

            }

        }
        if (count == 0){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }else {
            System.out.printf("%d word pairs found!%n",count);
            if (list.isEmpty()){
                System.out.println("No mirror words!");
            }else {
                System.out.println("The mirror words are:");
                System.out.println(list.toString().replace("[","").replace("]",""));
//              System.out.println(String.join(", ", list));

            }

        }

    }
    public static String reverse (String name){


        String result = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            result += name.charAt(i);

        }
        return result;
    }
}
