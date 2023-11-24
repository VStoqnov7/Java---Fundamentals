package P28ExamsMid;

import java.util.*;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> newList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        for (String element : newList) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }


        String command = scanner.nextLine();


        while (!command.equals("Go Shopping!")) {


            //"Urgent {item}" -
            //"Unnecessary {item}"
            //"Correct {oldItem} {newItem}" -
            //"Rearrange {item}" -

            String[] input = command.split(" ");

            switch (input[0]) {
                case "Urgent":
                    if (!list.contains(input[1])) {
                        list.add(0, input[1]);
                    }
                    break;
                case "Unnecessary":
                    if (list.contains(input[1])) {
                        list.remove(input[1]);
                    }
                    break;
                case "Correct":
                    if (list.contains(input[1])) {
                        int index = list.indexOf(input[1]);
                        list.set(index, input[2]);
                    }
                    break;
                case "Rearrange":
                    if (list.contains(input[1])) {
                        list.remove(input[1]);
                        list.add(input[1]);
                    }
                    break;

            }

            command = scanner.nextLine();
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }


        }


    }
}
