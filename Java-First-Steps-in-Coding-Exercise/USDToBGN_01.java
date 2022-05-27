package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class USDToBGN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        //1 USD = 1.79549 BGN
        double bgn = usd * 1.79549;
        System.out.println(bgn);

    }
}
