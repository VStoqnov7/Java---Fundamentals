package P29FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();


        while (!command.equals("Travel")){

            String[] input = command.split(":");

            switch (input[0]){
                case "Add Stop":
                    //Add Stop:{index}:{string}
                    int indexAddStop = Integer.parseInt(input[1]);
                    String nameAddStop = input[2];

                    if (indexAddStop >= 0 && indexAddStop < sb.length()){

                        sb.insert(indexAddStop,nameAddStop);

                    }

                    System.out.println(sb);

                    break;
                case "Remove Stop":
                    //Remove Stop:{start_index}:{end_index}
                    int indexRemoveStopStart = Integer.parseInt(input[1]);
                    int indexRemoveStopEnd = Integer.parseInt(input[2]);

                    if (indexRemoveStopStart >= 0 && indexRemoveStopStart < sb.length() && indexRemoveStopEnd >= 0 && indexRemoveStopEnd < sb.length()){

                        sb.delete(indexRemoveStopStart,indexRemoveStopEnd + 1);

                    }
                    System.out.println(sb);
                    break;
                case "Switch":
                    //Switch:{old_string}:{new_string}

                    String oldSwitch = input[1];
                    String newSwitch = input[2];

                    String name = sb.toString();

                    if (name.contains(oldSwitch)){

                        String newName = name.replace(oldSwitch,newSwitch);
                        sb = new StringBuilder(newName);

                    }
                    System.out.println(sb);
                    break;

            }

            command = scanner.nextLine();
        }




        System.out.printf("Ready for world tour! Planned stops: %s",sb);








    }
}
