package FirstStepsInBasics.Exercise;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());
        int totalTime = countPages / pagesPerHour;
        int neededHours = totalTime / countDays;
        System.out.println(neededHours);

    }
}
