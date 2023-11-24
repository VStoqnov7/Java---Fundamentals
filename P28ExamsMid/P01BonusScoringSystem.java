package P28ExamsMid;


import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int students = scanner.nextInt();
        int lectures = scanner.nextInt();
        int bonus = scanner.nextInt();
        int maxAttendances = 0;
        double maxBonus = 0;
        for (int i = 0; i < students; i++) {
            int attendances = scanner.nextInt();
            double studentBonus = attendances / (double) lectures * (5 + bonus);
            if (studentBonus > maxBonus) {
                maxAttendances = attendances;
                maxBonus = studentBonus;
            }
        }
        System.out.printf("Max Bonus: %d.\n", (int) Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendances);



    }
}