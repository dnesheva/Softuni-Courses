package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student {
        //полета -> характеристики
        private String name;
        private String lastName;
        private double  grade;

        //конструктор
        public Student(String name, String lastName, double grade) {
            //нов празен обект
            //name = null
            //age = 0
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }

        //методи -> функционалности

        public double getGrade() {
            return this.grade;
        }
        @Override
        public String toString(){
            return String.format("%s %s: %.2f", this.name, this.lastName, this.grade);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int studentCount = 1; studentCount <= n; studentCount++) {
            String personalData = scanner.nextLine();
            String firstName = personalData.split(" ")[0];
            String lastName = personalData.split(" ")[1];
            double grade = Double.parseDouble(personalData.split(" ")[2]);

            Student student  = new Student(firstName, lastName, grade);
            studentList.add(student);

        }
        studentList.sort(Comparator.comparingDouble(Student :: getGrade)
                .reversed());
        for (Student student : studentList) {
            System.out.println(student.toString());

        }



    }
}
