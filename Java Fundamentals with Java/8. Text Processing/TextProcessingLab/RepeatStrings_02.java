package TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split(" ");
        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i < words.length ; i++) {
            //изнасяме в променлива думата
            String currentWord = words[i];
            //дължина
            int len = currentWord.length();
            String repeatWord = repeatString(currentWord, len);
            repeatList.add(repeatWord);

        }
        System.out.println(String.join("",repeatList));

    }
    //извеждаме в метод за повтаряне на думи
    public static String repeatString(String s, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;

        }
        return result;
    }
}
