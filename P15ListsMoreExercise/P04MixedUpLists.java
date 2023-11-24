package P15ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> first = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List <Integer> second = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> sum = new ArrayList<>();

        for (Integer item : first) {
            sum.add(item);

        }
        for (Integer item : second) {
            sum.add(item);

        }


        int index1Number = sum.get(sum.size()/2);
        int index2Number = sum.get((sum.size()/2) - 1);

        int max = Math.max(index1Number,index2Number);
        int min = Math.min(index1Number,index2Number);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < sum.size(); i++) {
            if (sum.get(i) > min && sum.get(i) < max ){
                result.add(sum.get(i));

            }

        }

        Collections.sort(result);


        for (Integer item : result) {
            System.out.print(item + " ");

        }

    }
}
