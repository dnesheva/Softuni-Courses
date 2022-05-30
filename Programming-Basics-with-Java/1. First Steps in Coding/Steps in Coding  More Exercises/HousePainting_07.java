package FirstStepsInBasics.MoreExercise;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //steni - zelena 3.4 kw.m za lityr
        //pokriv - chervena 4.3 kw za lityr
        double strWalls = x * y;
        double window = 1.5 * 1.5;
        double strtotal = 2 * strWalls  - 2 * window;
        double wallst = (2 * (x * x) - (1.2 * 2));
        double totalArea = strtotal + wallst;
        double greenBoya = totalArea / 3.4;
        double roof = 2 * (x * y);
        double pokriwtr = ((2 * (x * h)) / 2);

        double total = roof + pokriwtr;
        double redBoya = total / 4.3;
        System.out.printf("%.2f%n",greenBoya);
        System.out.printf("%.2f",redBoya);



    }
}
