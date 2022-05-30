package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double result = 0;
     while (true){
         if (n < 0){
             System.out.println("Negative number!");
             break;
         }
         result = n * 2;
         System.out.printf("Result: %.2f%n", result);
         n = Double.parseDouble(scanner.nextLine());
     }



        }
    }

