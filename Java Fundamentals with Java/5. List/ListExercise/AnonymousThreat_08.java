package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> texts = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")){
            //merge startindex endindex
            //divide index partitions
            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                //proverka za start index
                if (startIndex < 0){
                    startIndex = 0;
                }
                //proverka za end index
                if (endIndex > texts.size() -1){
                    endIndex = texts.size()- 1;
                }
                //valiwirame index
                boolean isValidIndexes = startIndex <= texts.size() - 1 && endIndex >= 0 && startIndex < endIndex ;
                if (isValidIndexes){
                    //merge
                String resultMerge = "";
                    for (int index = startIndex; index <= endIndex ; index++) {
                        String currentText = texts.get(index);
                        resultMerge += currentText;
                    }
                    //remove
                    for (int index = startIndex; index <= endIndex ; index++) {
                        texts.remove(startIndex);
                    }
                    //dobawqme rezultata ot merge
                    texts.add(startIndex,resultMerge);
                }

            }else if (command.contains("divide")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                String elementForDivide = texts.get(index);
                texts.remove(index);
                //колко елемента ще има всяка една част
                int partSize = elementForDivide.length() / parts;
                int beginIndexOfText = 0;
                for (int part = 1; part < parts ; part++) {
                    texts.add(index, elementForDivide.substring(beginIndexOfText, beginIndexOfText + partSize));
                    index++;
                    beginIndexOfText += partSize;

                }
                //dobawqme ostanalite simwoli kym poslednata chast
                texts.add(index,elementForDivide.substring(beginIndexOfText));
            }
            command = scanner.nextLine();
        }

        //drug pechat
        //System.out.println(String.join(" ", texts));
        for (String text: texts) {
            System.out.print(text + " ");
        }


    }
}
