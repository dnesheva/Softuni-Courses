package FirstStepsInBasics.MoreExercise;

import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double scumriaPrice = Double.parseDouble(scanner.nextLine()); //скумрия
        double cacaPrice = Double.parseDouble(scanner.nextLine()); //цаца
        double palamudKg = Double.parseDouble(scanner.nextLine()); //паламид
        double safridKg = Double.parseDouble(scanner.nextLine()); //сафрид
        int midiKg = Integer.parseInt(scanner.nextLine()); //миди

         double palamudPrice = scumriaPrice + (scumriaPrice * 0.60);
         double safridPrice = cacaPrice + (cacaPrice * 0.80);
         double midiPrice = midiKg * 7.50;
         double totalSum = palamudPrice * palamudKg + safridPrice * safridKg + midiPrice;

        System.out.printf("%.2f", totalSum);



    }
}
