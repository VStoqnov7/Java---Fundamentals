package P29FinalExam;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());


        String command = scanner.nextLine();


        while (!command.equals("Travel")) {

            String[] name = command.split(":");

            switch (name[0]) {
                case "Add Stop":
                    //Добавяне на стоп:{index}:{string}"
                    int indexAddStop = Integer.parseInt(name[1]);
                    String textAddStop = name[2];
                    if (indexAddStop >= 0 && indexAddStop < sb.length()) {
                        sb.insert(indexAddStop, textAddStop);
                    }
                    break;

                case "Remove Stop":
                    //Премахване на стоп:{start_index}:{end_index}
                    int indexStart = Integer.parseInt(name[1]);
                    int indexEnd = Integer.parseInt(name[2]);

                    if (indexStart >= 0 && indexStart < sb.length() && indexEnd >= 0 && indexEnd < sb.length()) {
                        sb.delete(indexStart, indexEnd + 1);
                    }
                    break;

                case "Switch":
                    //Превключване:{old_string}:{new_string}

                    String oldString = name[1];
                    String newString = name[2];

                    if (sb.toString().contains(oldString)){
                    String names = sb.toString().replace(oldString,newString);
                    sb = new StringBuilder(names);

                    }
                    break;

            }


            System.out.println(sb);
            command = scanner.nextLine();
        }


        System.out.printf("Ready for world tour! Planned stops: %s", sb);


    }
}
