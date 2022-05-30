package FirstStepsInBasics.Lab;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());
        //1 project = 3 hours
        int neededHours = countProjects * 3;


        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, neededHours, countProjects);
    }
}
