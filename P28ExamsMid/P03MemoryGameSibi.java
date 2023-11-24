package P28ExamsMid;


import java.util.Scanner;

public class P03MemoryGameSibi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] elements = scan.nextLine().split(" ");
        int moves = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                System.out.println("Sorry you lose :( ");
                System.out.println(String.join(" ", elements));
                break;
            }

            int index1 = Integer.parseInt(input.split(" ")[0]);
            int index2 = Integer.parseInt(input.split(" ")[1]);
                moves++;

            if (index1 < 0 || index2 < 0 || index1 >= elements.length || index2 >= elements.length || index1 == index2) {
                System.out.println("Invalid input! Adding additional elements to the board");
                elements = addElement(elements, moves);
                continue;
            }

            if (elements[index1].equals(elements[index2])) {
                System.out.println("Congrats! You have found matching elements - " + elements[index1] + "!");
                elements = removeElements(elements, index1, index2);


                if (elements.length == 0) {
                    System.out.println("You have won in " + moves + " turns!");
                    break;
                }
            } else {
                System.out.println("Try again!");
            }


        }
    }

    private static String[] removeElements(String[] elements, int index1, int index2) {
        String[] newElements = new String[elements.length - 2];
        int currentIndex = 0;

        for (int i = 0; i < elements.length; i++) {
            if (i != index1 && i != index2) {
                newElements[currentIndex] = elements[i];
                currentIndex++;
            }
        }

        return newElements;
    }

    private static String[] addElement(String[] elements, int moves) {
        String[] newElements = new String[elements.length + 2];
        int middle = elements.length / 2;

        for (int i = 0; i < middle; i++) {
            newElements[i] = elements[i];
        }

        newElements[middle] = "-" + moves + "a";
        newElements[middle + 1] = "-" + moves + "a";

        for (int i = middle; i < elements.length; i++) {
            newElements[i + 2] = elements[i];
        }

        return newElements;
    }
}


