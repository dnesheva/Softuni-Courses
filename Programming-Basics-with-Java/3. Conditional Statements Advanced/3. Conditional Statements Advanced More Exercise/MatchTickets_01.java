package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (category){
            case "VIP":
                price = 499.99;
                if (countPeople >= 1 && countPeople <= 4){
                    budget = budget - (budget * 0.75);
                }else if (countPeople <= 9){
                    budget = budget - (budget * 0.60);
                }else if (countPeople <= 24){
                    budget = budget - (budget * 0.50);
                }else if (countPeople <= 49){
                    budget = budget - (budget * 0.40);
                }else if (countPeople > 50){
                    budget = budget - (budget * 0.25);
                }
                break;
            case "Normal":
                price = 249.99;
                if (countPeople >= 1 && countPeople <= 4){
                    budget = budget - (budget * 0.75);
                }else if (countPeople <= 9){
                    budget = budget - (budget * 0.60);
                }else if (countPeople <= 24){
                    budget = budget - (budget * 0.50);
                }else if (countPeople <= 49){
                    budget = budget - (budget * 0.40);
                }else if (countPeople > 50){
                    budget = budget - (budget * 0.25);
                }

                break;

        }
        double totalPrice = price * countPeople;
        double leftBudget = budget - totalPrice ;

        if (totalPrice <= budget){
            System.out.printf("Yes! You have %.2f leva left.", leftBudget);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(leftBudget));
        }
    }
}
