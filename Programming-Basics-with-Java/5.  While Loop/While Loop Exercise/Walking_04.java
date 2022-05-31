package WhileExercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countSteps = 0;
        boolean winSteps = false;

        while (!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            countSteps+=steps;

            if (countSteps >= 10000){
                break;
            }


            input = scanner.nextLine();
        }
        if (input.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            countSteps+=stepsToHome;
        }
        if (countSteps >= 10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", countSteps - 10000);
        }else{
            System.out.printf("%d more steps to reach goal.", 10000-countSteps);
        }


    }
}
