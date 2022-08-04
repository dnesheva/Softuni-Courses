package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] foldersName =scanner.nextLine().split("\\\\");
        String fullFileName = foldersName[foldersName.length - 1];

        String filename = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + filename);
        System.out.println("File extension: " + extension);



    }
}
