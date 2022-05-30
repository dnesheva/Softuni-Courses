package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taxYear = Integer.parseInt(scanner.nextLine());
        double shoes = taxYear - (taxYear * 0.40);
        double equip = shoes- (shoes * 0.20);
        double ball = equip / 4;
        double accessories = ball / 5;
        double costs = taxYear + shoes + equip + ball + accessories;
        System.out.println(costs);

    }
}
