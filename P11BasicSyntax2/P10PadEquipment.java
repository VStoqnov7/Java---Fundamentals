package P11BasicSyntax2;

import java.util.Scanner;

public class P10PadEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //обща сума = сума за мечове + сума за одежди + сума за колани
        //1. сума за мечове = бр. мечове(ученици + 10%) * цена за мечовете(вход)
        //2. сума за одежди = бр. одежди = бр. ученици * цена за одеждите(вход)
        //3. сума за колани = бр. коланите (ученици - ученици / 6)  * цена за коланите(вход)
        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(studentsCount + 0.10 * studentsCount) * priceLight; //1.1 * studentsCount
        double sumRobes = studentsCount * priceRobe;
        double sumBelts = (studentsCount - studentsCount / 6) * priceBelt;

        double totalSum = sumLight + sumRobes + sumBelts; //крайната сума за плащане

        if(totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double needMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }


    }
}

//
//        double sumHave = Double.parseDouble(scanner.nextLine());    /// negovi pari
//
//        int numberStudents = Integer.parseInt(scanner.nextLine());   /// broi uchenici
//
//
//        double priceSabers = 0;
//        double priceRobe = 0;
//        double priceBelt = 0;
//
//        double lightSabersPrice = Double.parseDouble(scanner.nextLine());     //10% more
//
//        double robePrice = Double.parseDouble(scanner.nextLine());      /// cena drexi
//
//        double beltPrice = Double.parseDouble(scanner.nextLine());     /// 6ti belt free
//
//
//        for (int i = 1; i <= numberStudents ; i++) {
//
//
//            priceSabers += lightSabersPrice;
//
//            priceRobe += robePrice;
//
//            priceBelt += beltPrice;
//
//            if (i % 6 == 0){
//                priceBelt -= beltPrice;
//            }
//
//
//        }
//
//       double numbers = Math.ceil((numberStudents * 1.10));
//        double sabers = numbers * lightSabersPrice;
//
//        double sum = sabers + priceRobe + priceBelt;
//
//        if (sum <= sumHave){
//            System.out.printf("The money is enough - it would cost %.2flv.",sum);
//
//        }else {
//            System.out.printf("George Lucas will need %.2flv more.",Math.abs(sum - sumHave));
//        }
//
//
//
//    }
//}
