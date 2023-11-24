package P24TextProcessingMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String title = scanner.nextLine();
        String article = scanner.nextLine();

        List<String> list = new ArrayList<>();



        String command = scanner.nextLine();

        while (!command.equals("end of comments")){

            list.add(command);

            command = scanner.nextLine();
        }


        System.out.printf("<h1>%n    %s%n</h1>%n",title);
        System.out.printf("<article>%n    %s%n</article>%n",article);
        list.forEach(entry -> System.out.printf("<div>%n    %s%n</div>%n",entry));



    }
}
