package WhileExercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPoorGrades = Integer.parseInt(scanner.nextLine());

        int count = 0;
        double countProblems = 0;
        int totalSumGrades = 0;
        String lastProblem = "";
        boolean win = false;

        while (count < countPoorGrades){
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")){
                win = true;
                break;
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());
            if (currentGrade<= 4){
                count++;
            }
            countProblems++;
            totalSumGrades += currentGrade;
            lastProblem = problemName;

        }
        if (win){
            System.out.printf("Average score: %.2f%n",totalSumGrades / countProblems );
            System.out.printf("Number of problems: %.0f%n", countProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }else{
            System.out.printf("You need a break, %d poor grades.",count);
        }

    }
}
