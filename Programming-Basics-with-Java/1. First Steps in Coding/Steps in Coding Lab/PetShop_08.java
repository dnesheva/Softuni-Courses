package FirstStepsInBasics.Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //храна за кучета - 2.50 лв
        //храна за котки - 4 лв

        int foodDogs = Integer.parseInt(scanner.nextLine());
        int foodCats = Integer.parseInt(scanner.nextLine());
        double totalFood = foodDogs * 2.50 + foodCats * 4;
        System.out.printf("%.1f lv.", totalFood);

    }
}
