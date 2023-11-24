package P28ExamsMid;

import java.util.*;

public class P03NumbersRemoveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersStr = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;

        List<Integer> greaterThanAverage = new ArrayList<>();
        for (int number : numbers) {
            if (number > average) {
                greaterThanAverage.add(number);
            }
        }

        if (greaterThanAverage.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(greaterThanAverage, Collections.reverseOrder());
            int count = Math.min(5, greaterThanAverage.size());
            for (int i = 0; i < count; i++) {
                System.out.print(greaterThanAverage.get(i) + " ");
            }
        }
    }
}

//        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//
//        if (num.length == 1) {
//            System.out.println("No");
//            return;
//        }
//
//        int position = 0;
//        int[] numbers = new int[num.length];
//
//
//        for (int i = 0; i < num.length; i++) {
//
//            if (num[i] > average(num)){
//                numbers[position] = num[i];
//                position++;
//
//
//        }
//
//
//
//        }
//
//        for (int i = numbers.length - 1; i >= numbers.length - 5 ; i--) {
//            if (numbers[i] == 0){
//                continue;
//            }
//            System.out.print(numbers[i] + " ");
//
//        }
//
//
//    }
//
//    public static double average(int[] numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return (double) sum / numbers.length;
//
//    }
//}