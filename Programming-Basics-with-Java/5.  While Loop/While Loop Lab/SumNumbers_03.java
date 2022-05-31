package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (sum >= n){
                break;
            }
        }
        System.out.println(sum);


    }
}
