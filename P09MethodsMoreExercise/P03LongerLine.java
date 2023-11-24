package P09MethodsMoreExercise;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        printLongerLine(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static void printLongerLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        double distance3 = Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2));
        double distance4 = Math.sqrt(Math.pow(x4, 2) + Math.pow(y4, 2));

        double length1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double length2 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));

        if (length1 >= length2) {
            if (distance1 <= distance2) {
                System.out.println("(" + x1 + ", " + y1 + ")(" + x2 + ", " + y2 + ")");
            } else {
                System.out.println("(" + x2 + ", " + y2 + ")(" + x1 + ", " + y1 + ")");
            }
        } else {
            if (distance3 <= distance4) {
                System.out.println("(" + x3 + ", " + y3 + ")(" + x4 + ", " + y4 + ")");
            } else {
                System.out.println("(" + x4 + ", " + y4 + ")(" + x3 + ", " + y3 + ")");
            }
        }
    }
}