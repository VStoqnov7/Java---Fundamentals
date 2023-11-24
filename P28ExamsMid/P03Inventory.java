package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")){

            String[] name = command.split(" - ");

            switch (name[0]){
                case "Collect":
                    //Collect - {item}"
                    String itemIndex1 = name[1];
                    if (!list.contains(itemIndex1)){
                        list.add(itemIndex1);
                    }
                    break;
                case "Drop":
                    //Drop - {item}
                    itemIndex1 = name[1];
                    if (list.contains(itemIndex1)){
                        list.remove(itemIndex1);
                    }

                    break;
                case "Combine Items":
                    //Combine Items - {old_item}:{new_item}
                    itemIndex1 = name[1];
                   String[] index1 = itemIndex1.split(":");
                   String index1OfItemIndex1 = index1[0];
                   String index2OfItemIndex1 = index1[1];

                    int indexList = list.indexOf(index1OfItemIndex1);
                    if (list.contains(index1OfItemIndex1)){
                        list.add(indexList + 1,index2OfItemIndex1);
                    }
                    break;
                case "Renew":
                    //Renew – {item}
                    itemIndex1 = name[1];
                    if (list.contains(itemIndex1)){
                        int index = list.indexOf(itemIndex1);
                        list.remove(index);
                        list.add(itemIndex1);
                    }



                    break;
            }


            command = scanner.nextLine();
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1){
                System.out.print(", ");
            }

        }

    }
}
