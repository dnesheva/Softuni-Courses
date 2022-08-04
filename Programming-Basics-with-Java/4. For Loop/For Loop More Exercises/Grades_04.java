package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());

        int moreThan5 = 0;
        int moreThan4 = 0;
        int moreThan3 = 0;
        int lessThan3 = 0;

        double markResult = 0;



        for (int i = 1; i <= students ; i++) {
            double mark = Double.parseDouble(scanner.nextLine());
            if (mark >= 2.00 && mark < 3.00){
                lessThan3++;
            }else if (mark >= 3.00 && mark <= 3.99){
                moreThan3++;
            }else if (mark >= 4.00 && mark <= 4.99){
                moreThan4++;
            }else if (mark >= 5.00){
                moreThan5++;

            }
            markResult += mark;
        }

        double topStudents = 100.0 * moreThan5 / students;
        double fourStudents = 100.0 * moreThan4 / students;
        double threeStudents = 100.0 * moreThan3 / students;
        double twoStudents = 100.0 * lessThan3 / students;
        System.out.printf("Top students: %.2f%%%n",topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",fourStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",threeStudents);
        System.out.printf("Fail: %.2f%%%n",twoStudents);
        System.out.printf("Average: %.2f",markResult/students);
    }
}
