package ForLoop;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = 1; i <= number ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;

        }
        System.out.println(sum);
    }
}
