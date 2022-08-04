package ObjectsAndClassesExercise;

import java.util.Scanner;

public class Articles_02 {
    private String title;
    private String content;
    private String author;

    public Articles_02 (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
    public void edit (String newContent){
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString() {
        //{title} - {content}:{author}
        return this.title + " - "+ this.content + ": " + this.author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleDate = scanner.nextLine();
        String title = articleDate.split(", ")[0];
        String content = articleDate.split(", ")[1];
        String author = articleDate.split(", ")[2];

        Articles_02 articles_02 = new Articles_02(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            String commandName =  command.split(": ")[0];
            String newValue = command.split(": ")[1];
                    switch (commandName){
                        case "Edit":
                            articles_02.edit(newValue);
                            break;
                        case "ChangeAuthor":
                            articles_02.changeAuthor(newValue);
                            break;
                        case "Rename":
                            articles_02.rename(newValue);
                            break;
                    }

        }
        System.out.println(articles_02.toString());

    }
}
