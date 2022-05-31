package WhileLoopLab;

import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        while (!name.equals("Stop")){
            System.out.println(name);

            name = scanner.nextLine();


        }


    }
}
