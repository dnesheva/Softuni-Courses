package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());
        double price = magnolii * 3.25 + zumbuli * 4 + rozi * 3.50 + kaktusi * 8;
        double totalPrice = price - (price * 0.05);
        double diff = Math.abs(totalPrice - priceGift);
        if (priceGift <= totalPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(diff));
        }else{
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(diff));
        }

    }
}
