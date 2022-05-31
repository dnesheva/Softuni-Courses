package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum > max){
                max = currentNum;
            }
            sum += currentNum;

        }
        int sumWithoutMaxNumber = sum - max;
        if (max == sumWithoutMaxNumber){
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", sum);
        }else{
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(max - sumWithoutMaxNumber));
        }



    }
}
