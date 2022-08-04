package ObjectsAndClassesLab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordLists = Arrays.stream(scanner.nextLine()
                        .split(" " ))
                .collect(Collectors.toList());

        while (!wordLists.isEmpty()){
            Random rnd = new Random();
            int randomIndex = rnd.nextInt(wordLists.size());

            String word = wordLists.get(randomIndex);
            System.out.println(word);
            wordLists.remove(randomIndex);
        }

    }
}
