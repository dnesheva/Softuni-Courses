package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSeconds = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distance / 15) * 12.5;
        double timeIvan = distance * timeSeconds + delay;


        if (worldRecord > timeIvan){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(worldRecord - timeIvan));
        }

    }
}
