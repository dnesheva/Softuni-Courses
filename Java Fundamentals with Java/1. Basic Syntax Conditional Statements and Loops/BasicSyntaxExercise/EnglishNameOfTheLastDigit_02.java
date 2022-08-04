package BasicSyntaxExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Long.parseLong(scanner.nextLine());
        long absNum = Math.abs(number);
        long lastNum = number % 10;
        String englishNumName = "";

        if (lastNum == 1) {
            englishNumName = "one";
        } else if (lastNum == 2) {
            englishNumName = "two";
        } else if (lastNum == 3) {
            englishNumName = "three";
        } else if (lastNum == 4) {
            englishNumName = "four";
        } else if (lastNum == 5) {
            englishNumName = "five";
        }  else if (lastNum == 6) {
            englishNumName = "six";
        } else if (lastNum == 7) {
            englishNumName = "seven";
        } else if (lastNum == 8) {
            englishNumName = "eight";
        } else if (lastNum == 9) {
            englishNumName = "nine";
        } else if (lastNum == 0) {
            englishNumName = "null";
        }

        System.out.println(englishNumName);
    }
}
