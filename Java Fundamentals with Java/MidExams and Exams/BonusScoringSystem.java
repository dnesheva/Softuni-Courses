package MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        double maxBonusAttendances = 0;
        if (lecturesCount > 0 && studentsCount > 0){
            for (int i = 0; i < studentsCount ; i++) {
                double attendances = Double.parseDouble(scanner.nextLine());
                double totalBonus = attendances  / lecturesCount * (5 + additionalBonus);
                if (totalBonus >= maxBonus){
                    maxBonus = totalBonus;
                    maxBonusAttendances = attendances;
                }
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.", maxBonusAttendances);

            }


        }



