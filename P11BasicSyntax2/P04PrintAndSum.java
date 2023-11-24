package P11BasicSyntax2;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine()); // начало на интервал
        int endNumber = Integer.parseInt(scanner.nextLine()); // край на интервал

        //FOR цикъл
        //начало: startNumber
        //край: endNumber
        //повтаряме: отпечатваме числото
        //промяна: +1

        int sum = 0; //сума на числата
        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum = sum + number; //sum += number;
        }
        //System.out.printf("%nSum: %d", sum);
        System.out.println(); //сваляме курсора на нов ред
        System.out.println("Sum: " + sum);
    }
}