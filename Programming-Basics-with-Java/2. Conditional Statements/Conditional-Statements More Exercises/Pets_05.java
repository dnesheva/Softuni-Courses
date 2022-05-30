package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double foodKgDayDog = Double.parseDouble(scanner.nextLine());
        double foodKgDayCat = Double.parseDouble(scanner.nextLine());
        double foodGDayKostenurka = Double.parseDouble(scanner.nextLine());
        double foodKgKostenurka = foodGDayKostenurka / 1000;
        double food = (foodKgDayDog + foodKgDayCat + foodKgKostenurka) * daysCount;
        double diff = Math.abs(food - foodKg);
        if (foodKg >= food){
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
        }

    }
}
