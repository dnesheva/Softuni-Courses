package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInLitres = (length * width * height) / 1000.00;
        double neededLitres = volumeInLitres -(volumeInLitres * percent/100) ;
        
        System.out.println(neededLitres);

    }
}
