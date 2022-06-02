package DataTypesAndTypeConversionLab;

import java.util.Scanner;

public class ConvertMetersToKilometers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meter = Double.parseDouble(scanner.nextLine());
         double km = meter / 1000;
        System.out.printf("%.2f", km);

    }
}
