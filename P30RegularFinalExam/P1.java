package P30RegularFinalExam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();
        while (true) {
            String[] command = scanner.nextLine().split("\\s+");
            String operation = command[0];

            switch (operation) {
                case "Make":
                    int index = Integer.parseInt(command[2]);
                    char[] passwordChars = password.toCharArray();

                    if (index < 0 || index >= passwordChars.length) {
                        continue;
                    }

                    if (command[1].equals("Upper")) {
                        passwordChars[index] = Character.toUpperCase(passwordChars[index]);
                    } else if (command[1].equals("Lower")) {
                        passwordChars[index] = Character.toLowerCase(passwordChars[index]);
                    }

                    password = new String(passwordChars);
                    System.out.println(password);
                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(command[1]);
                    if (insertIndex < 0 || insertIndex > password.length()) {
                        continue;
                    }
                    password = password.substring(0, insertIndex) + command[2] + password.substring(insertIndex);
                    System.out.println(password);
                    break;
                case "Replace":
                    char charToReplace = command[1].charAt(0);
                    int valueToAdd = Integer.parseInt(command[2]);
                    int charIndex = password.indexOf(charToReplace);
                    if (charIndex == -1) {
                        continue;
                    }
                    char newChar = (char) (charToReplace + valueToAdd);
                    password = password.replace(charToReplace, newChar);
                    System.out.println(password);
                    break;
                case "Validation":
                    boolean isPasswordValid = true;
                    if (password.length() < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                        isPasswordValid = false;
                    }

                    for (char ch : password.toCharArray()) {
                        if (!Character.isLetterOrDigit(ch) && ch != '_') {
                            System.out.println("Password must consist only of letters, digits and _!");
                            isPasswordValid = false;
                            break;
                        }
                    }

                    boolean hasUppercase = false;
                    boolean hasLowercase = false;
                    boolean hasDigit = false;

                    for (char ch : password.toCharArray()) {
                        if (Character.isUpperCase(ch)) {
                            hasUppercase = true;
                        } else if (Character.isLowerCase(ch)) {
                            hasLowercase = true;
                        } else if (Character.isDigit(ch)) {
                            hasDigit = true;
                        }
                    }

                    if (!hasUppercase) {
                        System.out.println("Password must consist at least one uppercase letter!");
                        isPasswordValid = false;
                    }
                    if (!hasLowercase) {
                        System.out.println("Password must consist at least one lowercase letter!");
                        isPasswordValid = false;
                    }
                    if (!hasDigit) {
                        System.out.println("Password must consist at least one digit!");
                        isPasswordValid = false;
                    }

                    break;
                case "Complete":
                    return;
            }
        }
    }
}