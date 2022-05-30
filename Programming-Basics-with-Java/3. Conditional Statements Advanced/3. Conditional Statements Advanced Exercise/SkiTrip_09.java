package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String valuation = scanner.nextLine();
        double price = 0;

        if (typeRoom.equals("room for one person")){
            price = (days - 1) * 18;
        }else if (typeRoom.equals("apartment")){
            price = (days - 1) * 25;
            if (days < 10){
                price = price - (price * 0.30);

            }else if (days > 10 && days - 1 < 15){
                price = price - (price * 0.35);

            }else if (days > 15){
                price = price - (price * 0.50);

            }

        }else if (typeRoom.equals("president apartment")){
            price = (days - 1) * 35;
            if (days < 10){

                price = price - (price * 0.10);
            }else if (days > 10 && days  < 15){

                price = price - (price * 0.15);
            }else if (days > 15){
                price = price - (price * 0.20);
            }
        }


        if (valuation.equals("positive")){
            price = price + (price * 0.25);
            System.out.printf("%.2f",price);
        }else{
            price = price - (price * 0.10);
            System.out.printf("%.2f",price);
        }


    }
}
