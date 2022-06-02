package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());
        double maxSnowBallValue = Double.MIN_VALUE;
        int MaxSnowBallSnow = Integer.MIN_VALUE;
        int MaxSnowBallTime = Integer.MIN_VALUE;
        int maxSnowBallQuality = Integer.MIN_VALUE;
        for (int ball = 1; ball <= countBalls ; ball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double snowBallValue = Math.pow(snowballSnow / snowBallTime, snowBallQuality);

            if (snowBallValue > maxSnowBallValue){
                maxSnowBallValue = snowBallValue;
                MaxSnowBallSnow = snowballSnow;
                MaxSnowBallTime = snowBallTime ;
                maxSnowBallQuality = snowBallQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", MaxSnowBallSnow, MaxSnowBallTime , maxSnowBallValue, maxSnowBallQuality);
    }
}
