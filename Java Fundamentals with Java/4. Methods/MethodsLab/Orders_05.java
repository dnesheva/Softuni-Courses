package MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                printPriceCoffee(count);

                break;
            case "water":
                printPriceWater(count);

                break;
            case "coke":
                printPriceCoke(count);

                break;
            case "snacks":
                printPriceSnacks(count);

                break;
        }
    }
    public static void printPriceCoffee(int count){
        double result = count * 1.50;
        System.out.printf("%.2f", result);
    }
    public static void printPriceWater(int count){
        double result = count * 1.00;
        System.out.printf("%.2f", result);
    }
    public static void printPriceCoke(int count){
        double result = count * 1.40;
        System.out.printf("%.2f", result);
    }
    public static void printPriceSnacks(int count){
        double result = count * 2.00;
        System.out.printf("%.2f", result);

    }
}
