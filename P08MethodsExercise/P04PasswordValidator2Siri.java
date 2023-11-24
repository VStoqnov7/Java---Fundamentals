package P08MethodsExercise;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04PasswordValidator2Siri {
    public static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean consistsOfLettersAndDigits(String password) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean hasAtLeastTwoDigits(String password) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if (!isLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!consistsOfLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!hasAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isLengthValid(password) && consistsOfLettersAndDigits(password) && hasAtLeastTwoDigits(password)) {
            System.out.println("Password is valid");
        }
    }
}
