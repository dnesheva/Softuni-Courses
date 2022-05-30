package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int relaxDays = Integer.parseInt(scanner.nextLine());
        int workMinutes = 63;
        int relaxMinutes = 127;
        int restGamesMinutes = relaxDays * relaxMinutes;
        int workingDays = (365 - relaxDays) * 63;
        int total = workingDays  + restGamesMinutes;
        int difference = Math.abs(30000 - total);
        double hours = difference / 60;
        double minutes = difference % 60;

        if (30000 > total){
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);
        }else{
            System.out.println("Tom will run away");
            System.out.printf(" %.0f hours and %.0f minutes more for play", hours, minutes);
        }

    }
}
