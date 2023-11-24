package P12BasicSyntax2MoreExercise;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());


        String name = "";



        for (int i = 1; i <= number ; i++) {

            int num = Integer.parseInt(scanner.nextLine());


            switch (num){
                case 2:
                    name += 'a';
                    break;
                case 22:
                    name += 'b';
                    break;
                case 222:
                    name += 'c';
                    break;


                case 3:
                    name += 'd';
                    break;
                case 33:
                    name += 'e';
                    break;
                case 333:
                    name += 'f';
                    break;


                case 4:
                    name += 'g';
                    break;
                case 44:
                    name += 'h';
                    break;
                case 444:
                    name += 'i';
                    break;


                case 5:
                    name += 'j';
                    break;
                case 55:
                    name += 'k';
                    break;
                case 555:
                    name += 'l';
                    break;


                case 6:
                    name += 'm';
                    break;
                case 66:
                    name += 'n';
                    break;
                case 666:
                    name += 'o';
                    break;


                case 7:
                    name += 'p';
                    break;
                case 77:
                    name += 'q';
                    break;
                case 777:
                    name += 'r';
                    break;
                case 7777:
                    name += 's';
                    break;


                case 8:
                    name += 't';
                    break;
                case 88:
                    name += 'u';
                    break;
                case 888:
                    name += 'v';
                    break;


                case 9:
                    name += 'w';
                    break;
                case 99:
                    name += 'x';
                    break;
                case 999:
                    name += 'y';
                    break;
                case 9999:
                    name += 'z';
                    break;


                case 0:
                    name += ' ';
                    break;

            }


        }


            System.out.printf("%s",name);







    }
}
