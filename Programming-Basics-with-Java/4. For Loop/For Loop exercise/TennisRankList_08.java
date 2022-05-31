package ForLoopExercise;

import java.util.Scanner;

public class TennisRankList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGames = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int countWinner = 0;
        int countTotalPoints = 0;
        for (int i = 1; i <=countGames ; i++) {
            String type = scanner.nextLine();

            if (type.equals("F")){
                countTotalPoints += 1200;
            }else if (type.equals("SF")){
                countTotalPoints += 720;
            }else if (type.equals("W")){
                countWinner++;
                countTotalPoints += 2000;
            }

        }
        double average =Math.floor(countTotalPoints * 1.00 / countGames);
        double percent = countWinner * 1.00/ countGames * 100 ;
        System.out.printf("Final points: %d%n", countTotalPoints + startPoints);
        System.out.printf("Average points: %.0f%n", average);
        System.out.printf("%.2f%%",percent);

    }
}
