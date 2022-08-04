package MethodsExercises;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        //sum to get the sum of the first two integers and
        //subtract the method that subtracts the third integer from the result from the sum method.
        calculateSumTwoNumbers(number1,number2,number3);
    }
    private static void calculateSumTwoNumbers(int num1, int num2, int num3){
        int calculate = (num1 + num2) - num3;
        System.out.println(calculate);
    }


}
