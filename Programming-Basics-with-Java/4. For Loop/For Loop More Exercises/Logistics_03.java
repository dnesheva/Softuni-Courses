package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int countMicrobus = 0;
        double priceMicrobus = 0;
        int countKamion = 0;
        double priceKamion = 0;
        int countVlak = 0;
        double priceVlak = 0;

        for (int i = 1; i <= num ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum <= 3){
                countMicrobus = countMicrobus + currentNum;
                priceMicrobus = countMicrobus * 1.00 * 200;

            }else if (currentNum >= 4 && currentNum <= 11){
                countKamion = countKamion + currentNum;
                priceKamion = countKamion * 1.00 * 175;
            }else if (currentNum >= 12){
                countVlak  = countVlak + currentNum;
                priceVlak = countVlak * 1.00 * 120;
            }
        }

        double totalSum = countMicrobus + countKamion + countVlak;
        double microbus = countMicrobus * 1.00 / totalSum * 100;
        double camion = countKamion * 1.00 / totalSum * 100;
        double vlak = countVlak * 1.00 / totalSum * 100;
        double total = priceMicrobus + priceKamion + priceVlak;
        double average = total / totalSum;
        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", microbus);
        System.out.printf("%.2f%%%n", camion);
        System.out.printf("%.2f%%", vlak);
    }
}
