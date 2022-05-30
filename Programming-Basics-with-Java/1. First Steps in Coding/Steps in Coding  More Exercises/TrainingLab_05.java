package FirstStepsInBasics.MoreExercise;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //3 ≤ h ≤ w ≤ 100
        double columns = Math.floor(((h * 100) - 100) / 70);
        double rows = Math.floor((w * 100) / 120);

        double workSpace = columns * rows - 3;
        System.out.println(Math.round(workSpace));
    }
}
