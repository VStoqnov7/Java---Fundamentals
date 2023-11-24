package P04ArraysExercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of wagons
        int[] wagons = new int[n]; // Array to store the number of people getting on each wagon
        int total = 0; // Variable to store the total number of people on the train

        for (int i = 0; i < n; i++) {
            wagons[i] = scanner.nextInt();
            total += wagons[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(wagons[i] + " ");
        }

        System.out.println();
        System.out.println(total);
    }
}