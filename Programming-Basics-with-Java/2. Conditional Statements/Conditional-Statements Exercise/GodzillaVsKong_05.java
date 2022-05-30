package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double clotsPricePerStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double clotsPrice = clotsPricePerStatist * countStatists;
        if (countStatists > 150){
            clotsPrice = clotsPrice - (clotsPrice * 0.10);

        }
        double totalCosts = decorPrice + clotsPrice;
        if (budget >= totalCosts){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget - totalCosts));
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalCosts - budget));
        }


    }
}
