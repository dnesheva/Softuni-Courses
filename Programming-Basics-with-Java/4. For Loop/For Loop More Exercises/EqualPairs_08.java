package ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + currentNum;
        }
        for (int i = 0; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + currentNum;
        }
        for (int i = 0; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum3 = sum3 + currentNum;
        }

        System.out.println(sum1);
    }
}
