package WhileExercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();

        boolean isFound = false;
        int countBooks = 0;
        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {
        if (input.equals(wantedBook)){
            isFound = true;
            break;
        }
            countBooks++;
            input = scanner.nextLine();
        }
        if (isFound){
    System.out.printf("You checked %d books and found it.",countBooks);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
