package P29FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String,String>> products = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\|");
            //{piece}|{composer}|{key}“.

            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            products.put(piece,new LinkedHashMap<>());
            products.get(piece).put("composer",composer);
            products.get(piece).put("key",key);

        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")){

            String[] name = command.split("\\|");

            switch (name[0]){
                case "Add":
                    String pieceAdd = name[1];
                    String composerAdd = name[2];
                    String keyAdd = name[3];

                    if (!products.containsKey(pieceAdd)){
                        products.put(pieceAdd,new LinkedHashMap<>());
                        products.get(pieceAdd).put("composer",composerAdd);
                        products.get(pieceAdd).put("key",keyAdd);

                        System.out.printf("%s by %s in %s added to the collection!%n",pieceAdd,composerAdd,keyAdd);
                    }else {
                        System.out.printf("%s is already in the collection!%n",pieceAdd);
                    }
                    break;
                case "Remove":
                    String pieceRemove = name[1];

                    if (products.containsKey(pieceRemove)){
                        products.remove(pieceRemove);
                        System.out.printf("Successfully removed %s!%n",pieceRemove);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceChangeKey = name[1];
                    String newKeyChangeKey = name[2];

                    if (products.containsKey(pieceChangeKey)){
                        products.get(pieceChangeKey).put("key",newKeyChangeKey);
                        System.out.printf("Changed the key of %s to %s!%n",pieceChangeKey,newKeyChangeKey);
                    }else {

                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceChangeKey);
                    }
                    break;

            }


            command = scanner.nextLine();
        }



        products.entrySet().forEach(entry -> {
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get("composer"),entry.getValue().get("key"));
        });






    }
}

