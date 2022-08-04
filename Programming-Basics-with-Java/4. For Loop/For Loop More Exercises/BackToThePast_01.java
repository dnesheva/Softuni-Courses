package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        double yearsOld = 17;
        for (int year = 1800; year <= yearToLive ; year++) {
            if (year % 2 == 0){
                yearsOld ++;
                money = money - 12000;

            }else{
                yearsOld ++;
                money = money - (12000 + (yearsOld * 50));

            }

        }
        if (money >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        }else{
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(money));
        }

    }
}
