package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = "";
        char firstOccur = input.charAt(0);
        result += firstOccur;
        for (int position = 0; position < input.length(); position++) {
            char currentSymbol = input.charAt(position);
            if (currentSymbol != firstOccur){
                result += currentSymbol;
                firstOccur = currentSymbol;
            }

        }
        System.out.println(result);


    }
}
