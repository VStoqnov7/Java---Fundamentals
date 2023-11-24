package P29FinalExam;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            String[] input = command.split(" ");

            switch (input[0]) {
                case "TakeOdd":

                    String password = sb.toString();

                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i < password.length(); i += 2) {
                        newPassword.append(password.charAt(i));
                    }
                    password = newPassword.toString();

                    sb = new StringBuilder(password);

                    System.out.println(sb);
                        break;
                        case "Cut":
                            int indexStart = Integer.parseInt(input[1]);
                            int indexEnd = Integer.parseInt(input[2]) + indexStart;

                            sb.delete(indexStart,indexEnd);

                            System.out.println(sb);

                            break;
                        case "Substitute":
                            String nameToReplace = input[1];
                            String newName = input[2];


                            String name = sb.toString();
                            if (name.contains(nameToReplace)){
                            sb = new StringBuilder(name.replace(nameToReplace,newName));
                            System.out.println(sb);
                            }else {
                                System.out.println("Nothing to replace!");

                            }
                            break;


                    }


                    command = scanner.nextLine();
            }




        System.out.printf("Your password is: %s",sb);


        }
    }
