package ForLoopExercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double moneyForBirthday = 0;
        int brother = 0;
        int toys = 0;
        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    moneyForBirthday = 10;
                } else {
                    moneyForBirthday += 10.00 * i / 2;
                }
                brother++;
            } else {
                toys++;
            }
        }
        double toysMoney = toys * toyPrice;
        double totalMoney = moneyForBirthday + toysMoney - brother;
        if (washingMachine <= totalMoney){
            System.out.printf("Yes! %.2f", totalMoney - washingMachine);
        }else{
            System.out.printf("No! %.2f", washingMachine - totalMoney);
        }
    }
}
