package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        int totalCountToys = countPuzzles + countDolls + countBears + countMinions + countTrucks;
        double totalPrice = countPuzzles * 2.60 + countDolls * 3 + countBears * 4.10 + countMinions * 8.20 + countTrucks * 2;
        if (totalCountToys >= 50){
            totalPrice = totalPrice - ( totalPrice * 0.25);
        }
        totalPrice = totalPrice - (totalPrice * 0.10);
        if (budget <= totalPrice){
            System.out.printf("Yes! %.2f lv left.",Math.abs(budget - totalPrice));
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalPrice - budget));
        }





    }
}
