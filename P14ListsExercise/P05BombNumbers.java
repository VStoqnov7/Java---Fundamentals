package P14ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        // Read the special bomb number and its power
        String[] bombInfo = scanner.nextLine().split(" ");
        int bomb = Integer.parseInt(bombInfo[0]);
        int power = Integer.parseInt(bombInfo[1]);

        // Detonate the bombs
        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) == bomb) {
                int start = Math.max(0, i - power);
                int end = Math.min(numbers.size() - 1, i + power);
                numbers.subList(start, end + 1).clear();
                i = 0;
            } else {
                i++;
            }
        }

        // Calculate the sum of the remaining elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Print the result
        System.out.println(sum);
    }
}
