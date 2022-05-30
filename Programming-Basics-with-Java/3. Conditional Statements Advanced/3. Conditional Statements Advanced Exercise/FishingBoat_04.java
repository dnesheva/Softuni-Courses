package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishman = Integer.parseInt(scanner.nextLine());
        double priceShip = 0;


        if (season.equals("Spring")){
            priceShip = 3000;
        }else if (season.equals("Summer")){
            priceShip = 4200;
        }else if (season.equals("Autumn")){
            priceShip = 4200;
        }else if (season.equals("Winter")){
            priceShip = 2600;
        }
        if (fishman <= 6){
            priceShip = priceShip - (priceShip * 0.10);
        }else if (fishman <= 11){
            priceShip = priceShip - (priceShip * 0.15);
        }else {
            priceShip = priceShip - (priceShip * 0.25);
        }
        if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")){
            if (fishman%2 ==0){
                priceShip = priceShip - (priceShip * 0.05);
            }
        }

        if (priceShip <= budget){
            System.out.printf("Yes! You have %.2f leva left.", budget - priceShip);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", priceShip - budget);
        }




    }
}
