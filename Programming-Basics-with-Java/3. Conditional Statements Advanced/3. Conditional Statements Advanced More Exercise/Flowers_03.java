package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countHrizantemi = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countLaleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yesOrNo = scanner.nextLine();
         double priceHrizantema = 0;
         double priceRose = 0;
         double priceLale = 0;
         switch (season){
             case "Spring":
                 priceHrizantema = 3.75;
                 priceRose = 4.50;
                 priceLale = 4.15;
                 case "Summer":
                     priceHrizantema = 2.00;
                     priceRose = 4.10;
                     priceLale = 2.50;
                 break;
                case "Autumn":
                    priceHrizantema = 3.75;
                    priceRose = 4.50;
                    priceLale = 4.15;
                 case "Winter":
                     priceHrizantema = 3.75;
                     priceRose = 4.50;
                     priceLale = 4.15;
                 break;
         }
         double buket = priceHrizantema * countHrizantemi + priceRose * countRoses + priceLale * countLaleta;
         if (yesOrNo.equals("Y")){
             buket = buket + (buket* 0.15);

         }
         if (countLaleta > 7 && season.equals("Spring")){
             buket = buket - ( buket * 0.05);
         }
         if (countRoses >= 10 && season.equals("Winter")){
             buket = buket - ( buket * 0.10);
         }
         if (countLaleta+countHrizantemi+countRoses > 20){
             buket = buket - ( buket * 0.20);
         }
          buket = buket  + 2.00;
        System.out.printf("%.2f", buket);

    }
}
