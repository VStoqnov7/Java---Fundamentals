package P01DataTypesAndVariablesLab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        double Length = Double.parseDouble(scanner.nextLine());
        double Width = Double.parseDouble(scanner.nextLine());
        double volumePyramid = Double.parseDouble(scanner.nextLine());

        double volume = (Length * Width * volumePyramid) / 3;

        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f", volume);


    }
}
