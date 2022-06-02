package BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLight  = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(studentsCount + 0.10 * studentsCount) * priceLight;
        double sumRobes = studentsCount * priceRobe;
        double sumBelts = (studentsCount - studentsCount  / 6 ) * priceBelt;
        double totalSum = sumLight +sumRobes +sumBelts;
        if (totalSum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(budget-totalSum));
        }


    }
}
