package P09MethodsMoreExercise;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int x1 = 2, y1 = 4, x2 = -1, y2 = 2; // sample input
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printClosestPointToCenter(x1, y1, x2, y2); // calling the method with the given input
    }

    public static void printClosestPointToCenter(int x1, int y1, int x2, int y2) {
        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)); // calculate the distance of the first point from the center
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)); // calculate the distance of the second point from the center

        if (distance1 <= distance2) { // if the first point is closer to the center
            System.out.println("(" + x1 + ", " + y1 + ")");
        } else { // if the second point is closer to the center
            System.out.println("(" + x2 + ", " + y2 + ")");
        }
    }
}