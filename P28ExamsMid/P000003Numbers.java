package P28ExamsMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P000003Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> firstInput = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());


        String command = scanner.nextLine();


        while (!command.equals("Go Shopping!")){

            List<String> listCommand = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            switch (listCommand.get(0)){
                case "Urgent":
                    String name = listCommand.get(1);

                    if (!firstInput.contains(name)){
                        firstInput.add(0,name);
                    }

                    break;
                case "Unnecessary":
                    name = listCommand.get(1);
                    if (firstInput.contains(name)){
                        firstInput.remove(name);

                    }

                    break;
                case "Correct":
                   String nameOld = listCommand.get(1);
                    String nameNew = listCommand.get(2);

                    if (firstInput.contains(nameOld)){
                        int position = firstInput.indexOf(nameOld);
                        firstInput.set(position,nameNew);
                    }
                    break;
                case "Rearrange":
                    name = listCommand.get(1);

                    if (firstInput.contains(name)){
                        firstInput.remove(name);
                        firstInput.add(name);
                    }

                    break;

            }


            command = scanner.nextLine();
        }


        for (int i = 0; i < firstInput.size(); i++) {
            System.out.print(firstInput.get(i));
            if (i != firstInput.size() - 1){
                System.out.print(", ");
            }

        }





    }
}
