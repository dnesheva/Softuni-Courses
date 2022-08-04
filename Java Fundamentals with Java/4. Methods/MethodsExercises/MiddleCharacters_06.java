package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //metod, printira sreden simvol-nechetna - 1 simvol, chetna - 2 simvola
        printMiddleCharacters(text);
        }
        private static void printMiddleCharacters(String text){
        if (text.length() % 2 == 1){
            int indexOffMiddleCharacter = text.length()/2;
        System.out.println(text.charAt(indexOffMiddleCharacter));

        }
        //chetna dulzhina 2 simvola
        else{
            int indexFirstMiddleCharacter = text.length()/2 - 1;
            int indexSecondMiddleCharacter = text.length()/2;
            System.out.println(text.charAt(indexFirstMiddleCharacter)+ "" + text.charAt(indexSecondMiddleCharacter));
        }
    }
}

