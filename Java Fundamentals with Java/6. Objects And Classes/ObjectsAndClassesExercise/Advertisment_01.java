package ObjectsAndClassesExercise;

import java.util.Random;
import java.util.Scanner;

public class Advertisment_01 {
    static class Advert{
        private String phrases;
        private String events;
        private String authors;
        private String cities;

        public String getPhrases() {
            return phrases;
        }

        public void setPhrases(String phrases) {
            this.phrases = phrases;
        }

        public String getEvents() {
            return events;
        }

        public void setEvents(String events) {
            this.events = events;
        }

        public String getAuthors() {
            return authors;
        }

        public void setAuthors(String authors) {
            this.authors = authors;
        }

        public String getCities() {
            return cities;
        }

        public void setCities(String cities) {
            this.cities = cities;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int times = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();

        for (int i = 0; i < times; i++) {
            int randomPhrase = rnd.nextInt(phrases.length);
            int randomEvent = rnd.nextInt(events.length);
            int randomAuthor = rnd.nextInt(authors.length);
            int randomCity = rnd.nextInt(cities.length);

            System.out.println(String.join(" ", phrases[randomPhrase] + " " + events[randomEvent]
                    + " " + authors[randomAuthor] + " - " + cities[randomCity]));
        }
    }
}
