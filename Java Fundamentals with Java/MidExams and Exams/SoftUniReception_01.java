package MidExam;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person1 = Integer.parseInt(scanner.nextLine());
        int person2 = Integer.parseInt(scanner.nextLine());
        int person3 = Integer.parseInt(scanner.nextLine());

        int remainingStudents = Integer.parseInt(scanner.nextLine());
        int studentsPerHours = person1 + person2 + person3;
        int hoursPassed = 0;
        while (remainingStudents > 0){
            hoursPassed++;
            if (hoursPassed % 4 != 0){
                remainingStudents -= studentsPerHours;
            }



        }
        System.out.printf("Time needed: %dh.",hoursPassed);

    }
}
