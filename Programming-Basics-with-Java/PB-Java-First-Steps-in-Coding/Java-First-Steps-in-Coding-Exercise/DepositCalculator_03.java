package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int termInMonths = Integer.parseInt(scanner.nextLine());
        double gpr = Double.parseDouble(scanner.nextLine());
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double increase = deposit * gpr/100;
        double increaseForMonth = increase / 12;
        double totalSum = deposit + termInMonths * increaseForMonth;
        System.out.println(totalSum);

    }

}
