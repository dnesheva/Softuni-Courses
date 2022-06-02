package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int capacity = 255;

        for (int i = 1; i <= numberOfLines ; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());

            if (quantities > capacity){
                System.out.println("Insufficient capacity!");
                continue;
            }else {
                sum = sum + quantities;
            }
            capacity = capacity - quantities;
        }

        System.out.printf("%d", sum);

    }
}
