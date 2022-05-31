package ForLoopExercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int countValuers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countValuers ; i++) {
            String currentName = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());
            int length = currentName.length();
            double calculatedPoints = length  * currentPoints / 2 ;
            points = points + calculatedPoints;
            if (points > 1250.5){
                break;

            }

        }
        if (points > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - points);

        }

    }
}
