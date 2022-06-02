package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;

        while (counter < inputNumber) {
            String numbersToCompare = scanner.nextLine();

            String[] s = numbersToCompare.split(" ");

            long numb1 =Long.parseLong(s[0]);
            long numb2 =Long.parseLong(s[1]);

            if (numb1 > numb2) {
                while (numb1 != 0 ) {
                    sum += numb1%10;
                    numb1 /= 10;
                }

                System.out.println(Math.abs(sum));

            } else {
                while (numb2 != 0 ) {
                    sum += numb2%10;
                    numb2 /= 10;
                }
                System.out.println(Math.abs(sum));
            }

            sum = 0;
            counter++;
        }
    }
}
