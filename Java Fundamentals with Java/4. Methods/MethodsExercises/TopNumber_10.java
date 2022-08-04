package MethodsExercises;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n ; number++) {
            //1. metod - sumata ot cifrite da se deli na 8,
            //2. metod - sudurzha pone edna nechetna cifra
            if (isSumDigitDivisibleBy8(number) && isContainsOddDigit(number)){
                System.out.println(number);
            }

        }

    }
    //metod, koito proveriava dali sumata ot cifrite/8
    //true -> se deli na 8
    //false -> sumata ne se deli na 8
    private static boolean isSumDigitDivisibleBy8(int number){
        //sumata ot cifrite
        int sumDigits = 0;
        while (number > 0){
            //wzimame poslednata cifra
            int lastDigit = number % 10;
            //dobawqm kum sumata
            sumDigits += lastDigit;
            //premahwam poslednata cifra ot chislata
            number = number / 10;
        }
        //proverka dali sumata se deli na 8
        return sumDigits % 8 == 0;
    }
    //metod za prowerka pone 1 nechetna cifra
    private static boolean isContainsOddDigit(int number){
        while (number > 0){
            //1.wzimam poslednata cifra
            int lastDigit = number % 10;
            //2. proverka dali e nechetna
            if (lastDigit % 2 == 1){
                return true;
            }
            //premahwam cifrata ot chisloto
            number = number / 10;
        }
        //minali pres wsichki sifri - false;
        return false;
    }
}
