package FirstStepsInBasics.MoreExercise;

import java.util.Scanner;

public class CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;
        double circleArea = 2 * Math.PI * r;
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f", circleArea);
    }
}
