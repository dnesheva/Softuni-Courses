package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        int totalStrength = 0;
        for (int position = 0; position < text.length() ; position++) {
            char currentSymbol = text.charAt(position);
            if (currentSymbol == '>'){
                //преобразуваме char ('1') --> string "1" --> int (1)
                int attackStrength = Integer.parseInt(text.charAt(position + 1) + "");
                totalStrength += attackStrength;
            }else if (currentSymbol != '>' && totalStrength >0){
                text.deleteCharAt(position);
                totalStrength--;
                position --;
            }

        }
        System.out.println(text);



    }
}
