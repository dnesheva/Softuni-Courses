package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!input.equals("stop")){
            int currentNumber = Integer.parseInt(input);
            if (currentNumber < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = true;
            for (int i = 2; i <= currentNumber - 1 ; i++) {
                if (currentNumber % i == 0){
                    nonPrimeSum+= currentNumber;
                    flag = false;
                    break;
                }

            }
            if (flag){
                primeSum+=currentNumber;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}
