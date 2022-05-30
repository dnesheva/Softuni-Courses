package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double nylonPrice = (nylon + 2)* 1.50;
        double paintPrice = (paint * 14.50) * 1.10;
        double thinnerPrice = thinner * 5.00;
        double costsMaterials = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double work = (costsMaterials * 0.30) * hours;
        double totalCosts = costsMaterials + work;
        System.out.println(totalCosts);

    }
}
