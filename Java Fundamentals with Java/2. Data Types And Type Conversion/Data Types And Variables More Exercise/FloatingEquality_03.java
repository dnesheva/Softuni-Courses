package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double eps = 0.000001;
        if (Math.abs(num1 - num2) < eps){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
