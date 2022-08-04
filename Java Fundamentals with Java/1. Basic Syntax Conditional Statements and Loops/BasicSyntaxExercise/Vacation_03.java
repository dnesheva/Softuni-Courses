package BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        switch (type){
            case "RegularExpressionsLab":

                if (day.equals("Friday")){
                    price = 8.45;
                }else if (day.equals("Saturday")){
                    price = 9.80;
                }else if (day.equals("Sunday")){
                    price = 10.46;
                }
                if (group >= 30){
                    price = price - (price * 0.15);

                }

                break;
            case "Business":
                if (day.equals("Friday")){
                    price = 10.90;
                }else if (day.equals("Saturday")){
                    price = 15.60;
                }else if (day.equals("Sunday")){
                    price = 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = 15;
                }else if (day.equals("Saturday")){
                    price = 20;
                }else if (day.equals("Sunday")){
                    price = 22.50;
                }
                if (group >= 10 && group <= 20){
                    price = price - (price * 0.05);
                }
                break;
        }
        double totalPrice = price * group;
        if (type.equals("Business") && group >= 100){
        totalPrice = (group - 10) * price;
        }
        System.out.printf("Total price: %.2f", totalPrice);


    }
}
