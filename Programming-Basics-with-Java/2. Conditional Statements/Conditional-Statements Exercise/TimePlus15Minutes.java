package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allMinutes = hour * 60 + minutes + 15;
        int hours = allMinutes / 60;
        int min = allMinutes % 60;
        if (hours > 23){
            hours = 0;
        }
        if (min < 10){
            System.out.printf("%d:0%d", hours, min);
        }else{
            System.out.printf("%d:%d", hours, min);
        }



    }
}
