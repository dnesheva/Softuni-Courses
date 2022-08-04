package BasicSyntaxExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double inputBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double gamePrice = 0;
        double currentBalance = inputBalance;
        while (!command.equals("Game Time")){
            switch (command){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    command = scanner.nextLine();
                    continue;


            }
            if (gamePrice > currentBalance){
                System.out.println("Too Expensive");
                gamePrice = 0;
                command = scanner.nextLine();
                continue;

            }
            currentBalance -= gamePrice;

            if (currentBalance >= 0 ){
                System.out.printf("Bought %s%n", command);

            }
            if (currentBalance < 0){
                System.out.println("Out of money!");
                break;
            }
            command = scanner.nextLine();
        }
        if (currentBalance > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", inputBalance - currentBalance, currentBalance);
        }else{
            System.out.println("Out of money!");
        }


    }
}
