package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //за всеки кег - модел, радиус и височина

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";
        for (int i = 1; i <= n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            //обем на кега : π * r^2 * h
            double volume  = Math.PI * Math.pow(radius, 2) * height;
            if (volume> maxVolume){
                maxVolume = volume;
                maxModel = model;
            }
        }
        System.out.println(maxModel);


    }
}
