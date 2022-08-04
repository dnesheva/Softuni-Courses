package ObjectsAndClassesExercise;

import java.util.*;

public class Articles2_04 {
    static class Article{
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> articleList=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] articleToken=scanner.nextLine().split(", ");
            String title=articleToken[0];
            String content=articleToken[1];
            String author=articleToken[2];
            Article article=new Article(title,content,author);
            if(!articleList.contains(article)){
                articleList.add(article);
            }
        }
        String filter=scanner.nextLine();
        switch (filter){
            case "content":
                Collections.sort(articleList, new Comparator<Article>() {
                    @Override
                    public int compare(Article o1, Article o2) {
                        return o1.content.compareTo(o2.content);
                    }
                });
                break;
            case "title":
                Collections.sort(articleList, new Comparator<Article>() {
                    @Override
                    public int compare(Article o1, Article o2) {
                        return o1.title.compareTo(o2.title);
                    }
                });
                break;
            case "author":
                Collections.sort(articleList, new Comparator<Article>() {
                    @Override
                    public int compare(Article o1, Article o2) {
                        return o1.author.compareTo(o2.author);
                    }
                });
                break;
        }
        for (Article article : articleList) {
            System.out.println(article);
        }
    }
    }
