package AssociativeArraysExercise;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];
            if (!courses.containsKey(courseName)){
                courses.put(courseName,new ArrayList<>());
            }
            courses.get(courseName).add(personName);

            input = scanner.nextLine();;
        }
        courses.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue()
                    .forEach(studentName -> System.out.println("-- " + studentName));
                });



    }
}
