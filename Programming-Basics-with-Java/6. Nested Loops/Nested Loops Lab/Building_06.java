package NestedLoops;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        //итерираме по етажи
        for (int i = floors; i >= 1 ; i--) {
            //итерираме по стаите
            for (int j = 0; j < rooms ; j++) {
                if (i == floors){
                    System.out.printf("L%d%d ", i ,j);
                }else if (i % 2 == 0){
                    System.out.printf("O%d%d ", i , j);
                }else{
                    System.out.printf("A%d%d ", i , j);
                }

            }
            //change floor
            System.out.println();
        }

    }
}
