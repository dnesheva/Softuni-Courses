package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine()); //obem
        int p1 = Integer.parseInt(scanner.nextLine()); //purva truba
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double firstP1 = hours * p1;
        double secondP2 = hours * p2;
        double totalWater = firstP1 + secondP2;

        if (totalWater <= V){
            double percentFull = totalWater/V*100;
            double percentP1 = firstP1/totalWater * 100;
            double percentP2 = secondP2/totalWater * 100;
            System.out.printf("The pool is %.2f%% full.", percentFull);
            System.out.printf("Pipe 1: %.2f%% Pipe 2: %.2f%%", percentP1, percentP2);
        }else{
            double overflow = totalWater - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overflow);
        }
    }
}
