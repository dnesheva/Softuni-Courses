package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int all = rows * columns;
        double price = 0;
        switch (type){
            case "Premiere":
                price = all * 12;
                break;
            case "Normal":
                price = all * 7.50;
                break;
            case "Discount":
                price = all * 5;
                break;
        }
        System.out.printf("%.2f leva", price);



    }
}
