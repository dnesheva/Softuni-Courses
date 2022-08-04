package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_07 {
    static class Person{

        private String name;
        private String id;
        private int age;

        //konstruktor alt + insert

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
        //getters and setters alt + insert
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        String personalData = scanner.nextLine();

        while (!personalData.equals("End")){
            //george 123456 20
            String name = personalData.split(" ")[0];
            String id = personalData.split(" ")[1];
            int age = Integer.parseInt(personalData.split(" ")[2]);

            //syzdawame obekt
            Person person = new Person(name,id,age);
            personList.add(person);


            personalData = scanner.nextLine();;
        }
        personList.sort(Comparator.comparing(Person :: getAge));
        for ( Person person: personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());

        }
    }
}
