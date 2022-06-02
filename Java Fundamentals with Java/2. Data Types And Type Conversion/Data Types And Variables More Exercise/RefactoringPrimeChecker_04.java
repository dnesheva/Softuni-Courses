package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= input; i++) {
            boolean isValid = true;
            for (int capital = 2; capital < i; capital++) {
                if (i % capital == 0) {
                    isValid = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isValid);


        }
    }
}
