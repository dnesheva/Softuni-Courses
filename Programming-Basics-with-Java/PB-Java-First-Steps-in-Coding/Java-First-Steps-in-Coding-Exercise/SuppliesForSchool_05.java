package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)
        double total = pens * 5.80 + markers * 7.20 + litres * 1.20;
        double discount = total * percentDiscount / 100;
        double totalSum = total - discount;
        System.out.println(totalSum);


    }
}
