package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double priceKm = 0;
        switch (season){
            case "Spring":
            case "Autumn":
                if (km <= 5000){
                    priceKm = 0.75;
                }else if (km <= 10000){
                    priceKm = 0.95;
                }else if (km <= 20000){
                    priceKm = 1.45;
                }
                break;
            case "Summer":
                if (km <= 5000){
                    priceKm = 0.90;
                }else if (km <= 10000){
                    priceKm = 1.10;
                }else if (km <= 20000){
                    priceKm = 1.45;
                }
                break;
            case "Winter":
                if (km <= 5000){
                    priceKm = 1.05;
                }else if (km <= 10000){
                    priceKm = 1.25;
                }else if (km <= 20000){
                    priceKm = 1.45;
                }
                break;
        }
        double money = km * priceKm * 4;
        double total = money - (money * 0.10);
        System.out.printf("%.2f", total);

    }
}
