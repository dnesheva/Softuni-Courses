package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вода - 20 лв.
        //интернет - 15 лв.
        //други - ток + вода + интернет за месеца + 20%
        //за всеки месец трябва да се пресметне и колко общо
        //за всички месеци
        int months = Integer.parseInt(scanner.nextLine());


        double totalMonthsOther = 0;
        double totalSumMonths = 0;
        double totalWater = 20 * months;
        double totalInternet = 15 * months;
        for (int i = 1; i <= months ; i++) {
            double priceElPerMonth = Double.parseDouble(scanner.nextLine());
            totalSumMonths += priceElPerMonth;
            double currentPrice = (priceElPerMonth + 20 + 15) ;
            double totalPrice = currentPrice + (currentPrice * 0.20);
            totalMonthsOther += totalPrice;
        }

        double average = (totalSumMonths + totalWater + totalInternet + totalMonthsOther) / months;
            System.out.printf("Electricity: %.2f lv%n", totalSumMonths);
            System.out.printf("Water: %.2f lv%n", totalWater);
            System.out.printf("Internet: %.2f lv%n", totalInternet);
            System.out.printf("Other: %.2f lv%n", totalMonthsOther);
            System.out.printf("Average: %.2f lv%n", average);



    }
}
