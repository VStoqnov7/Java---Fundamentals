package P31egularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());



        String command = scanner.nextLine();

        while (!command.equals("Finish")){

            String[] input = command.split(" ");

            switch (input[0]){
                case "Add":
                    int input2 = Integer.parseInt(input[1]);
                    list.add(input2);

                    break;
                case "Remove":
                    input2 = Integer.parseInt(input[1]);
                    int index = list.indexOf(input2);
                    if (list.contains(input2)){
                        list.remove(index);

                    }

                    break;
                case "Replace":
                    input2 = Integer.parseInt(input[1]);
                    int newInput = Integer.parseInt(input[2]);

                    if (list.contains(input2)){
                        int indexSet = list.indexOf(input2);

                        list.set(indexSet,newInput);
                    }

                    break;
                case "Collapse":
                    input2 = Integer.parseInt(input[1]);

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) < input2){
                            list.remove(i--);

                        }
                    }
                    break;


            }



            command = scanner.nextLine();
        }


        for (Integer item : list) {
            System.out.print(item + " ");

        }

    }
}
