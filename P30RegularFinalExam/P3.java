package P30RegularFinalExam;

import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> notebook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        String[] pairs = input.split("\\s*\\|+\\s*");
        for (String pair : pairs) {
            String[] wordDef = pair.split("\\:+\\s*");
            String word = wordDef[0];
            String definition = wordDef[1];
            if (!notebook.containsKey(word)) {
                notebook.put(word, new ArrayList<>());
            }
            notebook.get(word).add(definition);
        }

        String input2 = scanner.nextLine();
        String[] testWords = input2.split("\\s*\\|+\\s*");

        String command = scanner.nextLine();

        if (command.equals("Test")) {
            for (String word : testWords) {
                if (notebook.containsKey(word)) {
                    System.out.println(word + ":");
                    for (String definition : notebook.get(word)) {
                        System.out.println("-" + definition);
                    }
                }
            }
        } else if (command.equals("Hand Over")) {
            System.out.println(String.join(" ", notebook.keySet()));
        }
    }
}