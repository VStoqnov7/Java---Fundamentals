package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("End")){
            String[] input = command.split(" ");
            int index = Integer.parseInt(input[1]);


            switch (input[0]){
                case "Shoot":
                    //•	"Shoot {index} {power}"
                    int power = Integer.parseInt(input[2]);

                    if (index >= 0 && index < list.size()){
                        list.set(index,list.get(index) - power);
                        if (list.get(index) <= 0){
                        list.remove(index);
                        }

                    }

                    break;
                case "Add":
                    //"Add {index} {value}"
                    int value = Integer.parseInt(input[2]);

                    if (index >= 0 && index < list.size()){
                        list.add(index,value);


                    }else {
                        System.out.println("Invalid placement!");

                    }

                    break;
                case "Strike":
                    //•	"Strike {index} {radius}"
                    int radius = Integer.parseInt(input[2]);

                    int start = index - radius;
                    int end = index + radius;

                    if (start == 0 && end == list.size() - 1){
                        System.out.println("Strike missed!");
                        break;
                    }


                    if (start >= 0 && start < list.size() && end >=0 && end < list.size()){
                        list.subList(start,end + 1).clear();
                    }else {
                        System.out.println("Strike missed!");
                    }

                    break;

            }


            command = scanner.nextLine();
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1){
                System.out.print("|");
            }

        }

    }
}
