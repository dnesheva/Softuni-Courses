package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        String sport = "";
        double price = 0;
        switch (season){
            case "Winter":
                if (typeGroup.equals("boys")){
                    sport = "Judo";
                    price = 9.60;
                }else if (typeGroup.equals("girls")){
                    sport = "Gymnastics";
                    price = 9.60;
                }else if (typeGroup.equals("mixed")){
                    sport = "Ski";
                    price = 10;
                }
                break;
            case "Spring":
                if (typeGroup.equals("boys")){
                    sport = "Tennis";
                    price = 7.20;
                }else if (typeGroup.equals("girls")){
                    sport = "Athletics";
                    price = 7.20;
                }else if (typeGroup.equals("mixed")){
                    sport = "Cycling";
                    price = 9.50;
                }

                break;
            case "Summer":
                if (typeGroup.equals("boys")){
                    sport = "Football";
                    price = 15;
                }else if (typeGroup.equals("girls")){
                    sport = "Volleyball";
                    price = 15;
                }else if (typeGroup.equals("mixed")){
                    sport = "Swimming";
                    price = 20;
                }


                break;

        }
        double totalPrice = price * countNights * countStudents;
        if (countStudents >= 50){
            totalPrice = totalPrice - (totalPrice * 0.50);
        }else if (countStudents >= 20) {
            totalPrice = totalPrice - (totalPrice * 0.15);

        }else if (countStudents >= 10){
            totalPrice = totalPrice - (totalPrice * 0.05);

        }
        System.out.printf("%s %.2f lv.", sport, totalPrice);


    }
}
