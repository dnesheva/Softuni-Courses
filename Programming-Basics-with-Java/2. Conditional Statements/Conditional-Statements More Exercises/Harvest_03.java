package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double harvest = (x * 0.4) * y;
        double wine = harvest / 2.5;
        double totalLeft = Math.abs(wine - z);
        double perPerson = totalLeft / workers;
        if (wine < z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(totalLeft));
        }
        else if (wine >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(totalLeft),Math.ceil(perPerson));

        }



    }
}
