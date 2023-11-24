package P23TextProcessingExercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] name = scanner.nextLine().split("\\\\");

        String path = scanner.nextLine();
        //"C:\Internal\training-internal\Template.pptx"
        int indexLast = path.lastIndexOf("\\");
        String fullFileName = path.substring(indexLast + 1); //"Template.pptx"

        int indexPoint = fullFileName.indexOf(".");
        String fileName = fullFileName.substring(0, indexPoint);
        String fileExtension = fullFileName.substring(indexPoint + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}

//    String filePath = scanner.nextLine();
//
//    String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
//    String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
//
//        fileName = fileName.substring(0, fileName.lastIndexOf("."));
//
//                System.out.println("File name: " + fileName);
//                System.out.println("File extension: " + fileExtension);
//                }
//                }