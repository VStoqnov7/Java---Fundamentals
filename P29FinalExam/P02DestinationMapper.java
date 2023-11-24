package P29FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();


        Pattern pattern = Pattern.compile("([=|\\/])(?<name>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(command);


        List<String> list = new ArrayList<>();


        int sum = 0;

        while (matcher.find()){

            String name = matcher.group("name");

            list.add(name);

            for (char item : name.toCharArray()) {
                sum++;
            }

        }


        System.out.print("Destinations: ");
        System.out.println(String.join(", ",list));
        System.out.printf("Travel Points: %d",sum);















    }
}
