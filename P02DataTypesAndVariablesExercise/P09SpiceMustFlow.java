package P02DataTypesAndVariablesExercise;
import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int source = Integer.parseInt(scanner.nextLine()); //бр. подправки в полето
        //повтаряме всеки ден -> добив = yield - 26; намалям силата на полето с 10
        //стоп: бр. подправки в полето < 100
        //продължаваме: бр. подправки в полето >= 100

        int days = 0; //бр дни добив
        int totalAmountSpices = 0; //общо количество добити подправки
        while (source >= 100) {
            int spices = source - 26; //добив
            totalAmountSpices += spices;
            days++;
            source = source - 10;
        }

        System.out.println(days);
        //изяждат 26 подправки при пътуването до другата нива
        if (totalAmountSpices >= 26) {
            totalAmountSpices -= 26;
        }
        System.out.println(totalAmountSpices);
    }
}


//        int yeld = Integer.parseInt(scanner.nextLine());
//        int collect  = 0;
//        int days = 0;
//        if (yeld >= 100)
//        {
//            while (yeld >= 100)
//            {
//                days++;
//                collect += yeld;
//                yeld -= 10;
//
//            }
//            collect -= (days + 1) * 26;
//            System.out.println(days);
//            System.out.println(collect);
//        }
//        else
//        {
//            System.out.println(days);
//            System.out.println(collect);
//        }
//
//        }
//    }
