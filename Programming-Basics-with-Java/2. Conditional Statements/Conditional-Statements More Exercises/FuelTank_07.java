package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        boolean validFuel = (typeFuel.equals("Diesel") || typeFuel.equals("Gasoline") || typeFuel.equals("Gas"));
        if (!validFuel) {
            System.out.println("Invalid fuel!");
        }else {
            if (litres >= 25){
                System.out.printf("You have enough %s.",typeFuel.toLowerCase());
            }else{
                System.out.printf("Fill your tank with %s!",typeFuel.toLowerCase());
            }
        }


    }
}
