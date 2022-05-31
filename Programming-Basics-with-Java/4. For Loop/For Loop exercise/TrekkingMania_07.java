package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandzharo = 0;
        int k2 = 0;
        int everest = 0;
        double totalGroup = 0;
        for (int i = 1; i <= countGroups ; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            totalGroup = totalGroup + group;
            if (group <= 5){
                musala = musala + group;
            }else if (group <= 12){
                monblan = monblan + group;
            }else if (group <= 25){
                kilimandzharo = kilimandzharo + group;
            }else if (group <= 40){
                k2 = k2 + group;
            }else{
                everest = everest + group;
            }

        }
        System.out.printf("%.2f%%%n", musala / totalGroup * 100);
        System.out.printf("%.2f%%%n", monblan / totalGroup * 100);
        System.out.printf("%.2f%%%n", kilimandzharo / totalGroup * 100);
        System.out.printf("%.2f%%%n", k2 / totalGroup * 100);
        System.out.printf("%.2f%%%n", everest / totalGroup * 100);
    }
}
