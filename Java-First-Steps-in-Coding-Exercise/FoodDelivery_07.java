package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countChickenMenu = Integer.parseInt(scanner.nextLine());
        int countFishMenu = Integer.parseInt(scanner.nextLine());
        int countVegMenu = Integer.parseInt(scanner.nextLine());
        double food = countChickenMenu * 10.35 + countFishMenu * 12.40 + countVegMenu * 8.15;
        double desert = food * 0.20;
        double totalSum = food + desert + 2.50;
        System.out.println(totalSum);


    }
}
