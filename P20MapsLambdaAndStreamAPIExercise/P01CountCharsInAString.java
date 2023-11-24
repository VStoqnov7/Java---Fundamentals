package P20MapsLambdaAndStreamAPIExercise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class  P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //символ -> бр. срещания
        Map<Character, Integer> characterCounts = new LinkedHashMap<>();
        //HashMap - нямаме конкретна подредба на записите
        //LinkedHashMap - записите се подреждат спрямо реда на добавяне
        //TreeMap - записите се сортират по ключ

        //"Desislava" -> ['D', 'e', 's', 'i', 's', 'l', 'a', 'v', 'a']
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            //да сме го срещали
            if (characterCounts.containsKey(symbol)) {
                int currentCount = characterCounts.get(symbol);
                characterCounts.put(symbol, currentCount + 1);
            }
            //да не сме го срещали
            else {
                characterCounts.put(symbol, 1);
            }
        }

        //map: символ(key) -> бр. срещания(value)
        //entry (key: char -> value: int)
        // characterCounts.forEach((key, value)-> System.out.println(key + " -> " + value));

        for(Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}


//        String input = scanner.nextLine();
//
//        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
//
//        for (char letter : input.toCharArray()) {
//            if (letter != ' ') {
//                charCount.put(letter, charCount.getOrDefault(letter, 0) + 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//    }
//}


//        String command = scanner.nextLine();
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//
//        for (int i = 0; i < command.length(); i++) {
//
//            char letter = command.charAt(i);
//            if (letter == 32){
//                continue;
//            }
//            map.putIfAbsent(letter,0);
//            map.put(letter,map.get(letter) + 1);
//
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
//        }
//
//
//    }
//}
