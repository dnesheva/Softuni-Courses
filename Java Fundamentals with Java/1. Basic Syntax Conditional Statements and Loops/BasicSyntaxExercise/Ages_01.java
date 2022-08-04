package BasicSyntaxExercise;

import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String type = "";
        if (number >= 0 &&  (number <= 2)){
            type = "baby";
        }else if (number >= 3 &&  (number <= 13)){
            type = "child";
        }else if (number >= 14 &&  (number <= 19)){
            type = "teenager";
        }else if (number >= 20 &&  (number <= 65)){
            type = "adult";
        }else if (number >= 66){
            type = "elder";
        }
        System.out.println(type);

    }
}
