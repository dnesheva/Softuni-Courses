package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());
        double result = matchPower(numInput, powerInput);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));

    }
public static double matchPower(double num, double power){
    double result = 1;
        for (int i = 1; i <= power; i++) {
        result = result * num;
    }
        return result;

}
            }



