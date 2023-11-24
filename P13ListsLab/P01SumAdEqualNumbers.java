package P13ListsLab;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> newList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < newList.size() - 1 ; i++) {



            if (newList.get(i).equals(newList.get(i + 1))){

                newList.set(i,(newList.get(i) + newList.get(i + 1)));
                newList.remove(i + 1);
                i = -1;

            }


        }

        String output = joinElementsByDelimiter(newList ," ");
        System.out.println(output);





    }
    public static String joinElementsByDelimiter(List<Double> items,String delimiter){

        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
            
        }

        return output;




    }
}



//
//    List<Double> numbersList = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
//            .map(Double::parseDouble).toList());
//
//        for (int i = 0; i < numbersList.size() - 1; i++) {
//        double firstEl = numbersList.get(i);
//        double secondEl = numbersList.get(i + 1);
//
//        if (firstEl == secondEl) {
//        numbersList.set(i, numbersList.get(i) + numbersList.get(i + 1));
//        numbersList.remove(i + 1);
//
//        i = -1;
//        }
//        }
//
//        System.out.println(joinElementsByDelimiter(numbersList, " "));
//        }
//
//public static String joinElementsByDelimiter(List<Double> list, String delimiter) {
//        String result = "";
//        for (Double num : list) {
//        DecimalFormat df = new DecimalFormat("0.#");
//
//        String numFormat = df.format(num) + delimiter;
//
//        result += numFormat;
//        }
//
//        return result;
//        }
//        }
//
//
