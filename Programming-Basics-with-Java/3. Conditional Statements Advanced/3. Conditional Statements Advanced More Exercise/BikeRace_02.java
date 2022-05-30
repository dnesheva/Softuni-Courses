package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countYoung = Integer.parseInt(scanner.nextLine());
        int countOld = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double tax = 0;
        int totalCount = 0;
        double priceJuniors = 0;
        double priceSeniors = 0;
        switch (trace){
            case "trail":
                priceJuniors = 5.50 * countYoung;
                priceSeniors = 7 * countOld;
                tax = priceJuniors + priceSeniors;

                break;
            case "cross-country":
                totalCount = countYoung + countOld;
                priceJuniors = 8 * countYoung;
                priceSeniors = 9.50 * countOld;
                tax = priceJuniors + priceSeniors;
                if (totalCount >= 50){
                    tax = tax - (tax * 0.25);
                }
                break;
            case "downhill":
                priceJuniors = 12.25 * countYoung;
                priceSeniors = 13.75 * countOld;
                tax = priceJuniors + priceSeniors;
                break;
            case "road":
                priceJuniors = 20 * countYoung;
                priceSeniors = 21.50 * countOld;
                tax = priceJuniors + priceSeniors;
                break;
        }
        double totalTax = tax - (tax * 0.05);
        System.out.printf("%.2f",totalTax);


    }
}
