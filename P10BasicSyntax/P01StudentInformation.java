package P10BasicSyntax;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avgGrade = Double.parseDouble(scanner.nextLine());

        //Name: John, Age: 15, Grade: 5.40

        String outputData = String.format("Name: %s, Age: %d, Grade: %.2f",
                studentName, age, avgGrade);

        System.out.println(outputData);
    }
}
 