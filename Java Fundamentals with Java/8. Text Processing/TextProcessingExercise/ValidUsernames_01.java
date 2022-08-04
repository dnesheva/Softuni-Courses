package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] usernames = scanner.nextLine().split(", ");
        for (String username: usernames) {
            if (validateUsername(username)){
                System.out.println(username);
            }
        }

    }
    //метод, който проверява дали username е валиден
    public static boolean validateUsername(String username){
        if (username.length() < 3 || username.length() > 16){
            return false;
        }
        //тест" -> се преобразува в символи чрез toCharArray
        for (char symbol: username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)&& symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}
