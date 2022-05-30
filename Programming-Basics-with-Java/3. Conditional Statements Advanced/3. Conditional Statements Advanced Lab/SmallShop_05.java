package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (product){
            case "coffee":
                switch (town){
                    case "Sofia":
                        price = 0.50;
                        break;
                    case "Plovdiv":
                        price = 0.40;
                        break;
                    case "Varna":
                        price = 0.45;
                        break;
                }
                break;
            case "water":
                switch (town){
                    case "Sofia":
                        price = 0.80;
                        break;
                    case "Plovdiv":
                        price = 0.70;
                        break;
                    case "Varna":
                        price = 0.70;
                        break;
                }
                break;
            case "beer":
                switch (town){
                    case "Sofia":
                        price = 1.20;
                        break;
                    case "Plovdiv":
                        price = 1.15;
                        break;
                    case "Varna":
                        price = 1.10;
                        break;
                }
                break;
            case "sweets":
                switch (town){
                    case "Sofia":
                        price = 1.45;
                        break;
                    case "Plovdiv":
                        price = 1.30;
                        break;
                    case "Varna":
                        price = 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (town){
                    case "Sofia":
                        price = 1.60;
                        break;
                    case "Plovdiv":
                        price = 1.50;
                        break;
                    case "Varna":
                        price = 1.55;
                        break;
                }
                break;

        }
        System.out.println(amount * price);
    }
}
