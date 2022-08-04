package BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initHour = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());
        int allMinutes = initHour * 60 + initMinutes + 30;

        int hours = allMinutes / 60; //намираме часа
        int min = allMinutes % 60; //намираме минутите

        if (hours > 23){
            hours = 0;
        }
            System.out.printf("%d:%02d", hours, min);

    }
}
