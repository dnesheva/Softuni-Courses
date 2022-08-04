package Exams;

import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> pieceMap = new LinkedHashMap<>();
        for (int piece = 1; piece <= countPieces ; piece++) {
            String pieceData = scanner.nextLine();

            String pieceName = pieceData.split("\\|")[0];
            String composer = pieceData.split("\\|")[1];
            String tone =pieceData.split("\\|")[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(tone);

            pieceMap.put(pieceName,pieceInfo);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            if (command.contains("Add")){
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String tone = command.split("\\|")[3];
                if (pieceMap.containsKey(pieceName)){
                    System.out.println(pieceName + " is already in the collection!");
                }else{
                    List<String> info = new ArrayList<>();
                    info.add(composer);
                    info.add(tone);

                    pieceMap.put(pieceName, info);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, tone);
                }

            }else if (command.contains("Remove")){
                String removePiece = command.split("\\|")[1];
                if (pieceMap.containsKey(removePiece)){
                    pieceMap.remove(removePiece);
                    System.out.printf("Successfully removed %s!%n", removePiece);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                }

            }else if (command.contains("ChangeKey")){
                String pieceName = command.split("\\|")[1];
                String newTone = command.split("\\|")[2];
                if (!pieceMap.containsKey(pieceName)){
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                }else{
                    List<String> currentInfo = pieceMap.get(pieceName);
                    currentInfo.remove(1);
                    currentInfo.add(newTone);
                    pieceMap.put(pieceName,currentInfo);
                    System.out.printf("Changed the key of %s to %s!%n", pieceName, newTone);
                }

            }



            command = scanner.nextLine();
        }
        pieceMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
