package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String type = "";
        String town = "";
        switch (season){
            case "Summer":
                if (budget <= 1000){
                    type = "Camp";
                    town = "Alaska";
                    budget = budget * 0.65;
                }else if (budget > 1000 && budget <= 3000){
                    type = "Hut";
                    town = "Alaska";
                    budget = budget * 0.80;
                }else if (budget > 3000){
                    type = "Hotel";
                    town = "Alaska";
                    budget = budget * 0.90;
                }

                break;
            case "Winter":
                if (budget <= 1000){
                    type = "Camp";
                    town = "Morocco";
                    budget = budget * 0.45;
                }else if (budget > 1000 && budget <= 3000){
                    type = "Hut";
                    town = "Morocco";
                    budget = budget * 0.60;
                }else if (budget > 3000){
                    type = "Hotel";
                    town = "Morocco";
                    budget = budget * 0.90;
                }

                break;
        }

        System.out.printf("%s - %s - %.2f", town, type, budget);

    }
}
