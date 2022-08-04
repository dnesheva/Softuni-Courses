package AssociativeArraysExercise;

import java.awt.image.ImageProducer;
import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")){
            if (input.contains("|")){
                //"{force_side} | {force_user}"
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                //проверка дали имаме отбора
                if (!map.containsKey(team)){
                    //отбор - празен списък за играчите
                    map.put(team,new ArrayList<>());
                    map.get(team).add(player);

                }else{
                    //имаме такъв отбор
                    List<String> currentPlayers = map.get(team);
                    if (!currentPlayers.contains(player)){
                        currentPlayers.add(player);
                        map.put(team, currentPlayers);
                    }

                }

            }else if (input.contains("->")){
                //"{force_user} -> {force_side}"
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];
                //ако играча го има в някои от отборите - remove
                map.entrySet().forEach(entry -> entry.getValue().remove(player));
                //проверка дали съществува
                if (map.containsKey(team)){
                    List<String> currentPlayers  = map.get(team);
                    currentPlayers.add(player);
                    map.put(team,currentPlayers);
                }else{
                    //нямаме такъв отбор и такъв potrebitel
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);



            }
            input = scanner.nextLine();

        }
        //премахнем отборите, в които няма играчи
        //при филтър оставяме само отговарящите на условието
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(player -> System.out.println("! " + player));
                    }
                );

    }
}
