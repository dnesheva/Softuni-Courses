package MethodsLab;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInputNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondInputNumber = Integer.parseInt(scanner.nextLine());
        double result = 0.0;
        switch (operator){
            case "/":
                divideCalculate(firstInputNumber,secondInputNumber);
                break;
            case "*":
                multiplyCalculate(firstInputNumber,secondInputNumber);
                break;
            case "+":
                addCalculate(firstInputNumber,secondInputNumber);
                break;
            case "-":
                subtractCalculate(firstInputNumber,secondInputNumber);
                break;
        }



    }
    public static double divideCalculate(int firstNum, int secondNum){
    double result = firstNum * 1.0 / secondNum;
    System.out.printf("%.0f", result);
        return result;
    }
    public static double multiplyCalculate(int firstNum, int secondNum){
        double result = firstNum * secondNum;
        System.out.printf("%.0f", result);
        return result;
    }
    public static double addCalculate(int firstNum, int secondNum){
        double result = firstNum + secondNum;
        System.out.printf("%.0f", result);
        return result;
    }
    public static double subtractCalculate(int firstNum, int secondNum){
        double result = firstNum - secondNum;
        System.out.printf("%.0f", result);
        return result;
    }
}
