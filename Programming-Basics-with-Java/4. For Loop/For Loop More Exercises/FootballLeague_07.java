package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int countFens = Integer.parseInt(scanner.nextLine());

        int sectorA= 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 0; i < countFens; i++) {
            char symbol = scanner.nextLine().charAt(0);
            switch (symbol){
                case 'A':
                    sectorA++;
                    break;
                case 'B':
                    sectorB++;
                    break;
                case 'V':
                    sectorV++;
                    break;
                case 'G':
                    sectorG++;
                    break;
            }


        }
        System.out.printf("%.2f%%%n",sectorA * 1.0/countFens * 100);
        System.out.printf("%.2f%%%n",sectorB* 1.0/countFens * 100);
        System.out.printf("%.2f%%%n",sectorV* 1.0/countFens * 100);
        System.out.printf("%.2f%%%n",sectorG* 1.0/countFens * 100);
        System.out.printf("%.2f%%%n",countFens* 1.0/capacity * 100);
    }
}
