package P13ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            result.add(list1.get(i++));
            result.add(list2.get(j++));
        }

        while (i < list1.size()) {
            result.add(list1.get(i++));
        }

        while (j < list2.size()) {
            result.add(list2.get(j++));
        }


        System.out.println(result.toString().replace("[","").replace("]","").replaceAll(",",""));
    }
}


//    List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
//            .map(Integer::parseInt)
//            .collect(Collectors.toList());
//
//    List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
//            .map(Integer::parseInt)
//            .collect(Collectors.toList());
//
//    List<Integer> resultList = new ArrayList<>();
//    int minSize = Math.min(firstList.size(), secondList.size());
//        for (int i = 0; i < minSize; i++) {
//        int firstItem = firstList.get(i);
//        int secondItem = secondList.get(i);
//
//        resultList.add(firstItem);
//        resultList.add(secondItem);
//        }
//
//        if (firstList.size() > secondList.size()) {
//        resultList.addAll(firstList.subList(minSize, firstList.size()));
//        } else {
//        resultList.addAll(secondList.subList(minSize, secondList.size()));
//        }
//
//        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
//        }
//        }
