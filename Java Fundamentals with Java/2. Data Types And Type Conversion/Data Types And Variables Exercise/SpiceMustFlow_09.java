package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalAmountSpices = 0;

        while (source >= 100){
            int spices = source - 26;
            totalAmountSpices += spices;//добив
            days ++;
            source -= 10;
        }

        System.out.println(days);
        if (totalAmountSpices >= 26){
            totalAmountSpices -= 26;
        }
        System.out.println(totalAmountSpices);


    }
}
