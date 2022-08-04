package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] codes = scanner.nextLine().split("\\s+");
        double totalSum = 0; //сума от числата на всички кодове
        for (String code : codes ) {
            //пресмятане на числата
            double number = getModifiedNumber(code);
            //добавяме крайното число от кода към общата сума
            totalSum += number;

        }
        System.out.printf("%.2f", totalSum);



    }
    private static double getModifiedNumber (String code){
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number =Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(secondLetter, ' ')
                .trim());

        //проверките за първата буква -> firstLetter
       //ascii между 65 и 90 - главна буква
        if (Character.isUpperCase(firstLetter)){
            int positionUpperLetter = (int)firstLetter - 64;
            number/=  positionUpperLetter;
        }else{
            //малки букви - от 97 до 122
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;

        }

        //проверка за втората буква
        if (Character.isUpperCase(secondLetter)){
            int positionUpperLetter = (int)secondLetter - 64;
            number -=  positionUpperLetter;
        }else{
            //малки букви - от 97 до 122
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;

        }
        return number;
    }

}
