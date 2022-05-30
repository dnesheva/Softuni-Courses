package FirstStepsInBasics.MoreExercise;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  1 euro = 1.94 лв.
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double sumLv = priceVegetables * kgVegetables + priceFruits * kgFruits;
        double sumEuro = sumLv / 1.94;
        System.out.printf("%.2f", sumEuro);


    }
}
