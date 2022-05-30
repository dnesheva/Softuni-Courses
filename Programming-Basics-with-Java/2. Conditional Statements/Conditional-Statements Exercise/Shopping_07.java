package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoPrice = videoCount * 250;
        double cpuPrice = (videoPrice * 0.35) * cpuCount;
        double ramPrice = (videoPrice * 0.10) * ramCount;
        double totalPrice = videoPrice + cpuPrice + ramPrice;

        if (videoCount > cpuCount){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        if (totalPrice <= budget){
            System.out.printf("You have %.2f leva left!", Math.abs(budget - totalPrice));
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(totalPrice - budget));
        }

    }
}
