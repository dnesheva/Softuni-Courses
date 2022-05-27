package FirstStepsInBasics.Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // кв. м. е 7.61 лв със ДДС.
        //  18% отстъпка
        double kvM = Double.parseDouble(scanner.nextLine());
        double price = kvM * 7.61;
        double finalPrice = price - (price * 0.18);
        double discount = price * 0.18;
        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
