package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int number1 = Integer.parseInt(scanner.nextLine());
         int number2 = Integer.parseInt(scanner.nextLine());
         //da namerq faktoriela na pyrwoto chislo i na wtoroto chislo

        long fact1 = calculateFactorial(number1);
        long fact2 = calculateFactorial(number2);
        //da otpechatam faktorielite number 1 /number 2
        double result = fact1 * 1.00 / fact2;
        System.out.printf("%.2f", result);
    }

    //metod za namirane na faktorielite
    private static long calculateFactorial(int number){
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
