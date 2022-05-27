package FirstStepsInBasics.Lab;

import java.util.Scanner;

public class InchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());
        //1 инч = 2.54 сантиметра
        double sm = inch * 2.54;
        System.out.print(sm);
    }
}
