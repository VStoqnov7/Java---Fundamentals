package P28ExamsMid;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int piratesPlunder = Integer.parseInt(scanner.nextLine());

        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double plunder = 0;


        for (int i = 1; i <= n ; i++) {
            plunder += piratesPlunder;
            if (i % 3 == 0){
                plunder = plunder + (piratesPlunder * 0.50);
            }
            if (i % 5 == 0){
                plunder = plunder - (plunder * 0.30);
            }

        }


        if (plunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",plunder);

        }else {
        double totalPlunder = (plunder / expectedPlunder) * 100;
        System.out.printf("Collected only %.2f%% of the plunder.",totalPlunder);
        }







    }
}
