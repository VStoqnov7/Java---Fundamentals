package P29FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        Pattern patternNumbers = Pattern.compile("[0-9]");
        Matcher matcherNumbers = patternNumbers.matcher(command);

        long result = 1;


        while (matcherNumbers.find()){

            int number = Integer.parseInt(matcherNumbers.group());
            result = result * number;

        }

        Pattern patternEmoji = Pattern.compile("(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcherEmoji = patternEmoji.matcher(command);


        List<String> listEmoji = new ArrayList<>();

        int count = 0;


        while (matcherEmoji.find()){

            String emoji = matcherEmoji.group("emoji");
            int sum = 0;

            for (int i = 0; i < emoji.length(); i++) {
                int charSymbolNumber = (int)emoji.charAt(i);
                sum += charSymbolNumber;

            }

            if (sum >= result){
                listEmoji.add(matcherEmoji.group());
            }
                count++;

        }

        System.out.printf("Cool threshold: %d%n",result);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",count);
        if (!listEmoji.isEmpty()){
        listEmoji.forEach(System.out::println);


        }

    }
}
