package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int timeEpisode = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = timeBreak / 8.00;
        double timeForRelax = timeBreak / 4.00;
        double totalTime = timeBreak - (timeForLunch + timeForRelax);
        if (totalTime >= timeEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(totalTime - timeEpisode));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serial, Math.ceil(timeEpisode - totalTime));
        }




    }
}
