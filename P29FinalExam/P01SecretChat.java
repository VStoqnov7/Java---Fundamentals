package P29FinalExam;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();

        String command = scanner.nextLine();


        while (!command.equals("Reveal")){

            String[] input = command.split("\\:\\|\\:");

            switch (input[0]){
                case "InsertSpace":
                    int index = Integer.parseInt(input[1]);

                    name = name.substring(0,index) + " " + name.substring((index));
                    System.out.println(name);
                    break;
                case "Reverse":
                    String reverse = input[1];

                    if (name.contains(reverse)){
                        int indexReverse = name.indexOf(reverse);

                        name = name.substring(0,indexReverse) + name.substring(indexReverse + reverse.length());

                        for (int i = reverse.length() - 1; i >= 0 ; i--) {

                            char symbolReversed = reverse.charAt(i);

                            name += symbolReversed;

                        }
                        System.out.println(name);

                    }else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    String symbolChangeAll = input[1];
                    String newSymbolChangeAll = input[2];
                    name = name.replaceAll(symbolChangeAll,newSymbolChangeAll);

                    System.out.println(name);
                    break;
            }

            command = scanner.nextLine();
        }





        System.out.println("You have a new text message: "+ name);









    }
}
