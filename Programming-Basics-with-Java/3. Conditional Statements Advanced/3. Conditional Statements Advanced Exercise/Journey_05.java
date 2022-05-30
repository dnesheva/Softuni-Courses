package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100){
            if (season.equals("summer")){
                budget =  budget * 0.30;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", budget);
            }else if (season.equals("winter")){
                budget = budget * 0.70;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", budget);
            }
        }else if (budget <= 1000){
            if (season.equals("summer")){
                budget = budget * 0.40;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", budget);
            }else if (season.equals("winter")){
                budget = budget * 0.80;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", budget);
            }
        }else if (budget > 1000){
            budget = budget * 0.90;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", budget);
        }
    }
}
