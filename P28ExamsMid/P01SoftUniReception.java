package P28ExamsMid;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudentForHour = 0;

        for (int i = 1; i <= 3; i++) {
            int students = Integer.parseInt(scanner.nextLine());
            numberStudentForHour += students;
        }

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hour = 0;
        while (studentsCount > 0){
            studentsCount -= numberStudentForHour;
            hour++;
            if (hour % 4 == 0){
                hour++;
            }

        }
        System.out.printf("Time needed: %dh.",hour);






    }
}
